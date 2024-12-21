$(document).ready(function() {

	$.ajax({

		type: "POST",

		url: "ClienteController",

		dataType: "json"

	})

		.done(function(d) {

			$.each(d.data, function(index, value) {

				$("<tr></tr>").html("<td>" + value.nome + "</td>" +

					"<td>" + value.cidade + "</td>" +

					"<td>" + value.endereco + "</td>" +

					"<td>" + value.fone +

					"</td>").appendTo("#myTable");

			});

		})

		.fail(function() {

			alert("Ocorreu um erro durante o processamento.");

		});

});