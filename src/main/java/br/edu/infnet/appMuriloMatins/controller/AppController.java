package br.edu.infnet.appMuriloMatins.controller;


import br.edu.infnet.appMuriloMatins.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private PagamentoCartaoService pagamentoCartaoService;
    @Autowired
    private PagamentoDinheiroService pagamentoDinheiroService;
    @Autowired
    private CupomService cupomService;
    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(value = "/")
    public String telaHome(Model model) {

        model.addAttribute("qtdProdutos", produtoService.getQuantidadeProdutos());
        model.addAttribute("qtdPagamentosCartao", pagamentoCartaoService.getQuantidadePagamentosCartao());
        model.addAttribute("qtdPagamentosDinheiro", pagamentoDinheiroService.getQuantidadePagamentosDinheiro());
        model.addAttribute("qtdCupons", cupomService.getQuantidadeCupons());
        model.addAttribute("qtdPagamentos", pagamentoService.getQuantidadePagamentos());

        return "home";
    }

    @GetMapping(value = "/produto/listagem")
    public String listarProduto(Model model) {

        model.addAttribute("titulo" , "Listagem de Produtos");
        model.addAttribute("listagem", produtoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/pagamentoCartao/listagem")
    public String listarPagamentoCartao(Model model) {

        model.addAttribute("titulo" , "Listagem de Pagamentos Cartão");
        model.addAttribute("listagem", pagamentoCartaoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/pagamentoDinheiro/listagem")
    public String listarPagamentoDinheiro(Model model) {

        model.addAttribute("titulo" , "Listagem de Pagamentos Dinheiro");
        model.addAttribute("listagem", pagamentoDinheiroService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/cupom/listagem")
    public String listarCupom(Model model) {

        model.addAttribute("titulo" , "Listagem de Cupons");
        model.addAttribute("listagem", cupomService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/pagamento/listagem")
    public String listarPagamento(Model model) {

        model.addAttribute("titulo" , "Listagem de Pagamentos");
        model.addAttribute("listagem", pagamentoService.obterLista());

        return telaHome(model);
    }
}
