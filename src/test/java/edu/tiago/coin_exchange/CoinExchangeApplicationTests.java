package edu.tiago.coin_exchange;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CoinExchangeApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testRealToDollar() throws Exception {
		mockMvc.perform(get("/exchange/10/BRL/USD/4.50"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.valorConvertido").value(45.0))
				.andExpect(jsonPath("$.simboloMoeda").value("$"));
	}

	@Test
	public void testDollarToReal() throws Exception {
		mockMvc.perform(get("/exchange/10/USD/BRL/5.50"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.valorConvertido").value(55.0))
				.andExpect(jsonPath("$.simboloMoeda").value("R$"));
	}

	@Test
	public void testRealToEuro() throws Exception {
		mockMvc.perform(get("/exchange/10/BRL/EUR/5.0"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.valorConvertido").value(50.0))
				.andExpect(jsonPath("$.simboloMoeda").value("€"));
	}

	@Test
	public void testEuroToReal() throws Exception {
		mockMvc.perform(get("/exchange/10/EUR/BRL/6.0"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.valorConvertido").value(60.0))
				.andExpect(jsonPath("$.simboloMoeda").value("R$"));
	}

}
