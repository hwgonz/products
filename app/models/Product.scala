package models

import anorm.SQL
import anorm.SqlQuery


case class Product(ean: Long, name: String, description: String)

object Product {
  var products = Set(
    Product(5010255079763L, "Paperclips Large",
      "Large Plain Pack of 1000"),
    Product(5018206244666L, "Giant Paperclips",
      "Giant Plain 51mm 100 pack"),
    Product(5018306332812L, "Paperclip Giant Plain",
      "Giant Plain Pack of 10000"),
    Product(5018306312913L, "No Tear Paper Clip",
      "No Tear Extra Large Pack of 1000"),
    Product(5018206244611L, "Zebra Paperclips",
      "Zebra Length 28mm Assorted 150 Pack")
  )

  val sql: SqlQuery = SQL("select * from products order by name asc")

  def findAll = products.toList.sortBy(_.ean)

  def findByEan(ean: Long) = products.find(_.ean == ean)

  def add(product: Product): Unit = {
    products = products + product
  }

}

case class Warehouse(id: Long, name: String)

case class StockItem(
                      id: Long,
                      productId: Long,
                      warehouseId: Long,
                      quantity: Long)
