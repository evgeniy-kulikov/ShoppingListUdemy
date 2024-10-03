package ru.eugenypets.shoppinglist.domain

// InterActor (UseCase) - класс который отвечает за одно действие бизнес-логики
// InterActor (UseCase) - одна операция бизнес-логики, которую может вызвать пользователь

class EditShopItemUseCase(private val shopListRepository: ShopListRepository ) {

    // редактировать элемент списка
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)

    }
}