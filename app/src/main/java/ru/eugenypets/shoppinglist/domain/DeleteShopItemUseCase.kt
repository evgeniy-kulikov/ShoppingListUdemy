package ru.eugenypets.shoppinglist.domain

// InterActor (UseCase) - класс который отвечает за одно действие бизнес-логики
// InterActor (UseCase) - одна операция бизнес-логики, которую может вызвать пользователь

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // удалить элемент списка
    fun deleteShopItem(shopItem: ShopItem) {

        shopListRepository.deleteShopItem(shopItem)

    }

}