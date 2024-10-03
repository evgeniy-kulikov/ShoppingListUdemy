package ru.eugenypets.shoppinglist.data

import ru.eugenypets.shoppinglist.domain.ShopItem
import ru.eugenypets.shoppinglist.domain.ShopListRepository


// Решение без использования БД
// Все данные хранятся в переменных. При новом запуске приложения все пропадает.
// Data слой представляет реализацию Repository
// Классы осуществляющие реализацию интерфейса обычно в названии имеют суффикс Impl

object ShopListRepositoryImpl : ShopListRepository {

    // коллекция значений
    private val shopList = mutableListOf<ShopItem>()
    // начальное значение id
    private var autoIncrementId = 0

    // Переопределяем методы интерфейса ShopListRepository

    override fun addShopItem(shopItem: ShopItem) {
        // shopItem.id = autoIncrementId++

        // обрабатываем случай вставки первого значения в пустой список
        // или вставки нового измененного объекта методом editShopItem()
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        // Т.к. сейчас работаем не с БД а со списком, то используем методы списка
        // изменяем прежний существующий объект на новый (получаемый в параметре shopItem)
        // сохраняем прежний существующий объект  в переменную oldElement
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)  // удаляем объект
        addShopItem(shopItem)  // записываем новый объект (в конец списка)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId }
            ?: throw RuntimeException("Element with id $shopItemId not found") // если получим null
    }

    override fun getShopList(): List<ShopItem> {
        //  .toList()  - получаем копию списка
        return shopList.toList()
    }
}