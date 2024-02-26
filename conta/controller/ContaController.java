package conta.controller;

import java.util.ArrayList;
import java.util.List;

import conta.model.Conta;

public class ContaController {
    private List<Conta> contas;

    public ContaController() {
        contas = new ArrayList<>();
    }
    public Conta procurarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    public List<Conta> listarTodas() {
        return contas;
    }
    public void cadastrar(Conta conta) {
        contas.add(conta);
    }
    public void atualizar(Conta conta) {
        for (Conta c : contas) {
            if (c.getNumero() == conta.getNumero()) {
                c.setSaldo(conta.getSaldo());
                c.setCliente(conta.getCliente());
                break;
            }
        }
    }

    public void deletar(int numero) {
        Conta conta = procurarPorNumero(numero);
        if (conta != null) {
            contas.remove(conta);
        }
    }
}
