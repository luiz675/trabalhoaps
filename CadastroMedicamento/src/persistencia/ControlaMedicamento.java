package persistencia;

import negocio.Medicamento;

import java.util.ArrayList;

public class ControlaMedicamento {
    private ArrayList<Medicamento>medicamentos = new ArrayList<Medicamento>();
     public  boolean addMedicamento(Medicamento m){
         if (m != null){
             medicamentos.add(m);
             return  true;
         }else{
             return false;
         }
     }
     public ArrayList<Medicamento>mostrarMedicamento(){
        return medicamentos;
     }

    @Override
    public String toString() {
        return "ControlaMedicamento{" +
                "medicamentos=" + medicamentos +
                '}';
    }
}
