package com.katas.demo;

import com.katas.demo.models.Carrito;
import com.katas.demo.models.FoodProduct;
import com.katas.demo.models.FreeProduct;
import com.katas.demo.models.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


class DemoApplicationTests {

	@Test
	void elPrecioDeLosProductosGratuitosEsSiempreCero() {

		FreeProduct freeProduct = new FreeProduct("perejil");
		assertThat(freeProduct.getPrice(), equalTo(0.0) );

	}

	@Test
	void allProductsHaveNameAndPrice(){
		Product product = new Product();


		assertThat(product,hasProperty("price",nullValue()));
		assertThat(product,hasProperty("name",nullValue()));
	}

	@Test
	void aDiscountCanBeSetToAFoodProduct() {
		FoodProduct product = new FoodProduct("patatas",1.50);

		product.setDiscount(10.00);

		assertEquals(10.00,product.getDiscount());
	}

	@Test
	void aFoodProductPriceWithNoDiscountApliedIsEqualToTheOriginalPrice(){
		FoodProduct product = new FoodProduct("patatas",1.50);

		product.setDiscount(0.00);

		assertEquals(1.50,product.getPrice());
	}

	@Test
	void aFoodProductPriceWithDiscountApliedIsEqualToTheOriginalPriceWithDiscount(){
		FoodProduct product = new FoodProduct("patatas",10.00);

		product.setDiscount(25.00);

		assertEquals(7.50,product.getPrice());
	}

	@Test
	void carritoEmpty() {
		Carrito carrito = new Carrito();

		int productsCount = carrito.getProductsList().size();

		assertEquals(0, productsCount );
	}

	@Test
	void carritoTotalValuePricesWithDiscountApplied() {
		Product play5 = new Product("PlayStation5", 500.00);
//		FreeProduct agua = new FreeProduct("water bottle");
		//FoodProduct tomate = new FoodProduct("tomate", 5.00);
		//FoodProduct pollo = new FoodProduct("pollo criollo", 10.00);

		Carrito carrito = new Carrito();

		//pollo.setDiscount(50.00);
		carrito.add(play5);
		//carrito.add(agua);
		//carrito.add(tomate);
		//carrito.add(pollo);

		double result = carrito.getFinalPrice();

		assertEquals(510, result);
	}
}

