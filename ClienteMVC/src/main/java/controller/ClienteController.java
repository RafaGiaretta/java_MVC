package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import entities.Cliente;
import models.ClienteModel;

@WebServlet("/ClienteController")

public class ClienteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ClienteController() {

		super();

	}

	protected void doGet(HttpServletRequest request,

			HttpServletResponse response)

			throws ServletException, IOException {

		response.setContentType("application/json;charset=UTF-8");

		// obtendo os dados da camada de modelo

		ClienteModel c = new ClienteModel();

		List<Cliente> clientes = c.select();

		// convertendo de List para JSON

		JSONArray jsonArray = new JSONArray();

		for (Cliente cliente : clientes) {

			JSONObject jsonObject = new JSONObject(cliente);

			jsonArray.put(jsonObject);

		}

		// retornando os dados para a camada de visão

		JSONObject data = new JSONObject();

		data.put("data", jsonArray);

		response.getWriter().append(data.toString());

	}

	protected void doPost(HttpServletRequest request,

			HttpServletResponse response)

			throws ServletException, IOException {

		doGet(request, response);

	}

} // fim do servlet ClienteController
