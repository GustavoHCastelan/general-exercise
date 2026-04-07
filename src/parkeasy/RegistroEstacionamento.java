package parkeasy;

import java.time.Duration;
import java.time.LocalTime;

public class RegistroEstacionamento {
    String horaEntrada;
    String horaSaida;
    Veiculo veiculo;

    public RegistroEstacionamento (String horaEntrada, Veiculo veiculo){
        this.horaEntrada = horaEntrada;
        this.veiculo = veiculo;
    }

    public double calcularTotal() {
        LocalTime inicio, fim;
        long minutos;
        double valor;

        inicio = LocalTime.parse(horaEntrada);
        fim = LocalTime.parse(horaSaida);
        minutos = Duration.between(inicio, fim).toMinutes();
        valor = minutos * 0.75;
        return valor;
    }

}
