// Gerador por BootStrap e Revisado por mim

document.addEventListener("DOMContentLoaded", () => {
  
  
  
  // Pegando o ID da div do Modal
  const modal = document.getElementById("form_Atualizar");

  modal.addEventListener("show.bs.modal", (event) => {
    // Botão que acionou o modal
    const button = event.relatedTarget;

    // Pegando ID do item clicado
    const id = button.getAttribute("data-id");

    
    const row = button.closest("tr");

    // Dentro da linha encontrada (row), busca a segunda célula (td:nth-child(2)) e obtém seu conteúdo de texto.
    const nome = row.querySelector("td:nth-child(2)").textContent;
    const idade = row.querySelector("td:nth-child(3)").textContent;
    const rua = row.querySelector("td:nth-child(5)").textContent;
    const numero = row.querySelector("td:nth-child(6)").textContent;
    const regiao = row.querySelector("td:nth-child(7)").textContent;

    // Preenche os campos do modal
    
    // explicando > Seleciona o campo de input com o id="nome" dentro do modal e define o valor desse campo como o conteúdo extraído para nome.
    modal.querySelector("#nome").value = nome;
    
    modal.querySelector("#idade").value = idade;
    modal.querySelector("#rua").value = rua;
    modal.querySelector("#numero").value = numero;
    modal.querySelector("#regiao").value = regiao;

    // Ajusta a URL do formulário
    const form = modal.querySelector("form");
    form.setAttribute("action", `/atualizar/${id}`);
    console.log(`ID capturado: ${id}`);
  });
})