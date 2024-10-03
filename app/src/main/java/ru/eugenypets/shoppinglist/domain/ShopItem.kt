package ru.eugenypets.shoppinglist.domain

// основа всей бизнес-логики приложения
// сущность элемента списка
data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)
