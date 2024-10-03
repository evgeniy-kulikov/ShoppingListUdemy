package ru.eugenypets.shoppinglist.domain


// интерфейс между domain и data слоями
// этот репозиторий должен уметь делать все, что нужно нашим UseCase классам
interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>



}