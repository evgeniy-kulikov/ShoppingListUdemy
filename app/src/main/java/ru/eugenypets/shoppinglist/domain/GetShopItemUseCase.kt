package ru.eugenypets.shoppinglist.domain

// InterActor (UseCase) - класс который отвечает за одно действие бизнес-логики
class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // получить элемент списка
    fun getShopItem(shopItemId: Int): ShopItem {

        return shopListRepository.GetShopItem(shopItemId)

    }
}

