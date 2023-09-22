package utn.dacs.ms.bff.api.client;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import utn.dacs.ms.bff.BaseIntegrationTest;

@AutoConfigureMockMvc
class MsBffControllerTest extends BaseIntegrationTest {

	private final String baseUrl = "/";

	@Autowired
	public MockMvc mockMvc;
	
	@Test
	void shouldReturnPingOk() throws Exception {
		this.mockMvc
				.perform(MockMvcRequestBuilders.get(this.baseUrl + "ping").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello from RUS MS PORTAL PROVEEDORES BFF ping"));
	}
/*
	@Test
	void whenVersionIsOk() throws Exception {
		MvcResult result = null;
		result = this.mockMvc
		.perform(MockMvcRequestBuilders.get(this.baseUrl + "version").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andReturn();

		BuildInfoDTO buildResult = mapper.readValue(result.getResponse().getContentAsString(), BuildInfoDTO.class);

		assertThat(buildResult).hasFieldOrPropertyWithValue("applicationName", "ms-portalproveedores-bff");
	}
	
	*/
	
	@Test
	void shouldReturnCrmPingOk() throws Exception {
		this.mockMvc
				.perform(MockMvcRequestBuilders.get(this.baseUrl + "crm/ping").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello from RUS API-CRM - ping"));
	}
	
	/*
	 * @Test
	 
	void whenCrmVersionIsOk() throws Exception {
		MvcResult result = null;
		result = this.mockMvc
		.perform(MockMvcRequestBuilders.get(this.baseUrl + "crm/version").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andReturn();

		BuildInfoDTO buildResult = mapper.readValue(result.getResponse().getContentAsString(), BuildInfoDTO.class);

		assertThat(buildResult).hasFieldOrPropertyWithValue("applicationName", "rus-api-crm");
	}
	*/
	
}
