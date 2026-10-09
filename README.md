# Proyecto de Banco 
## BancoMacro.java
``` java
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
```
## cliente.java
```
package Banco;

/**
 *
 * @author Hp
 */
public class cliente {
    private Long id;
    private String nombre;
    private String Apellido;
    private String dni;
    
    
    public cliente(){}

    public cliente(Long id, String nombre, String Apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

   
    
    
    
}
```
## clienteDTO.java
```
package Banco;

/**
 *
 * @author Hp
 */
public class clienteDTO {
     private Long id;
    private String nombre;
    private String Apellido;
    private String dni;
    
    public clienteDTO(){}

    public clienteDTO(Long id, String nombre, String Apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "clienteDTO{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + '}';
    }
    
    
    
}

```
## cuenta.java
```
package Banco;

/**
 *
 * @author Hp
 */
public class cuenta {
    private Long id;
    private String nrcuenta;
    private Double saldo;
    
    public cuenta(){}

    public cuenta(Long id, String nrcuenta, Double saldo) {
        this.id = id;
        this.nrcuenta = nrcuenta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrcuenta() {
        return nrcuenta;
    }

    public void setNrcuenta(String nrcuenta) {
        this.nrcuenta = nrcuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}

```
## cuentaDTO.java
```
package Banco;

/**
 *
 * @author Hp
 */
public class cuentaDTO {
    private Long id;
    private String nrcuenta;
    private Double saldo;

    public cuentaDTO() {
    }

    public cuentaDTO(Long id, String nrcuenta, Double saldo) {
        this.id = id;
        this.nrcuenta = nrcuenta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public String getNrcuenta() {
        return nrcuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "cuentaDTO{" + "id=" + id + ", nrcuenta=" + nrcuenta + ", saldo=" + saldo + '}';
    }
    
    
}
```
## repuestaDTO.java
```
package Banco;

/**
 *
 * @author Hp
 */
public class repuestaDTO <T> {
    private boolean exito;
    private String mensaje;
    private T datos;
    
    public repuestaDTO(){}

    public repuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        return "repuestaDTO{" + "exito=" + exito + ", mensaje=" + mensaje + ", datos=" + datos + '}';
    }
   

    
}

```