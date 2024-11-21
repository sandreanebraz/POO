//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionarios[] = {new Assalariado(" Mario ", 3500),
                                      new Horista(" Luigui ",100, 40.5f),
                                      new Comissionado(" Yoshi ", 50000, 0.05f)};
        Funcionario f ;
        float total = 0;
        for (int i=0; i< funcionarios.length;i++){
          f = funcionarios[i];
            System.out.println(f.nome+" Salario: " + f.pagamento());
            total += f.pagamento();

        }
        System.out.println(" Total " + total);





    //Polimorfismo hora f1 é Assalariado , hora é Horista
        /*Funcionario f1 = new Assalariado("Mario", 3500);
     f1 = new Horista("Luigui", 100, 40.05f);*/



    }
}