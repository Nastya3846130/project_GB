Feature: Добавление товара в избранное
  Background:
    //Given Предусловие: например пользователь должен быть авторизован на сайте

    Scenario:
      When Я перехожу на главной странице в раздел Женское
      And Я кликаю на кнопку Купить на главной странице
      And Я кликаю на сердечко у любого товара
      And Я переходу на страницу сайта Избранное
      Then Я вижу, что выбранный товар появился в избранном