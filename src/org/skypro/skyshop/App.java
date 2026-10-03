package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 50);
        Product bread = new Product("Хлеб", 40);
        Product milk = new Product("Молоко", 80);
        Product cheese = new Product("Сыр", 200);
        Product butter = new Product("Масло", 150);
        Product extra = new Product("Шоколад", 100);

        ProductBasket basket = new ProductBasket();

        // 1. Добавление продукта в корзину
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);

        // 2. Добавление продукта в заполненную корзину
        basket.addProduct(cheese);
        basket.addProduct(butter);
        basket.addProduct(extra);

        // 3. Печать содержимого корзины
        System.out.println("--- Содержимое корзины ---");
        basket.printBasket();

        // 4. Получение стоимости корзины
        System.out.println("--- Стоимость корзины ---");
        System.out.println(basket.getTotalPrice());

        // 5. Поиск товара, который есть
        System.out.println("--- Поиск 'Хлеб' ---");
        System.out.println(basket.containsProductByName("Хлеб"));

        // 6. Поиск товара, которого нет
        System.out.println("--- Поиск 'Пицца' ---");
        System.out.println(basket.containsProductByName("Пицца"));

        // 7. Очистка корзины
        basket.clear();

        // 8. Печать содержимого пустой корзины
        System.out.println("--- Пустая корзина ---");
        basket.printBasket();

        // 9. Стоимость пустой корзины
        System.out.println("--- Стоимость пустой корзины ---");
        System.out.println(basket.getTotalPrice());

        // 10. Поиск в пустой корзине
        System.out.println("--- Поиск в пустой корзине ---");
        System.out.println(basket.containsProductByName("Хлеб"));
    }
}