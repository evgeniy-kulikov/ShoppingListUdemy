package ru.eugenypets.shoppinglist.domain

// InterActor (UseCase) - класс который отвечает за одно действие бизнес-логики
// InterActor (UseCase) - одна операция бизнес-логики, которую может вызвать пользователь

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // добавить элемент списка
    fun addShopItem(shopItem: ShopItem) {
        // реализация через метод интерфейса ShopListRepository
        shopListRepository.addShopItem(shopItem)
    }
}