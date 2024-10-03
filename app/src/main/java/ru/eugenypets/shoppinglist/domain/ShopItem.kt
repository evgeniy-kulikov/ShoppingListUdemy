package ru.eugenypets.shoppinglist.domain

// основа всей бизнес-логики приложения
// сущность элемента (строки) списка
data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
//    var id: Int = -1  // Т.к. сейчас работаем не с БД а со списком, то организуем самостоятельно автоинкримент id
    var id: Int = UNDEFINED_ID
) {
    // companion-объект определяется внутри  класса и позволяет определить свойства и методы,
    //  которые будут общими для всех объектов этого класса в целом, а не объекта.
    // в данном случае организуем свойство - константу  (начальное значение id)
    companion object {
        const val UNDEFINED_ID = -1
    }
}
