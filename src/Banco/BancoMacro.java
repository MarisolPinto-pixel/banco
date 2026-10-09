/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author Hp
 */
public class BancoMacro {
    public static clienteDTO convertirADTO (cliente cli){
        return new clienteDTO(cli.getId(),
                cli.getNombre(),
                cli.getApellido(),
                cli.getDni());
    }
    public static cuentaDTO convertirADTO (cuenta cu){
        return new cuentaDTO(cu.getId(),
                cu.getNrcuenta(),
                cu.getSaldo());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cliente cli= new cliente(44L, 
                "MARI",
                "PINTO", 
                "4376171");
     
        clienteDTO cliDTO= convertirADTO(cli);
        System.out.println("mostrar los ");
        System.out.println( cliDTO);
         cuenta cu = new cuenta(34L,
                 " 344343", 
                 4455.45);
         cuentaDTO cuDTO= convertirADTO(cu);
         System.out.println("mostrar cuenta");
         System.out.println(cu);
        repuestaDTO<clienteDTO> respuesta=new repuestaDTO<>(true, "encontrado", cliDTO);
            
    }
    
}
