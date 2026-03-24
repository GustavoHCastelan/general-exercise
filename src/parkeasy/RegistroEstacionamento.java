package parkeasy;

public class RegistroEstacionamento {
    String horaEntrada;
    String horaSaida;
    Veiculo veiculo;

    public RegistroEstacionamento (String horaEntrada, Veiculo veiculo){
        this.horaEntrada = horaEntrada;
        this.veiculo = veiculo;
    }

}
