package ru.eugenypets.shoppinglist.domain

// InterActor (UseCase) - класс который отвечает за одно действие бизнес-логики
// InterActor (UseCase) - одна операция бизнес-логики, которую может вызвать пользователь

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    // получить список
    fun getShopList(): List<ShopItem> {

        return shopListRepository.getShopList()

    }
}