public class Usuario {
    // Atributos
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String password;
    private boolean privilegio;
    private String departamento;

    // Constructor
    public Usuario(int idUsuario, String nombre, String apellidos, String correo, String password, boolean privilegio, String departamento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.privilegio = privilegio;
        this.departamento = departamento;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(boolean privilegio) {
        this.privilegio = privilegio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Métodos
    public void crearCuenta(String nombre, String apellidos, String correo, String password, boolean privilegio, String idDepartamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.privilegio = privilegio;
        this.departamento = idDepartamento;
    }

    public boolean inicioSesion(String correo, String password) {
        return this.correo.equals(correo) && this.password.equals(password);
    }

    public void editarDatos(String nombre, String apellidos, String correo, String password, boolean privilegio, String idDepartamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.privilegio = privilegio;
        this.departamento = idDepartamento;
    }

    public void darAlta(int idUsuario) {
        System.out.println("Usuario con ID " + idUsuario + " dado de alta.");
    }

    public void darBaja(int idUsuario) {
        System.out.println("Usuario con ID " + idUsuario + " dado de baja.");
    }

    public void consultarUsuarioId(int idUsuario) {
        System.out.println("Consultando usuario con ID: " + idUsuario);
    }

    public void consultarUsuarioNombre(String nombre) {
        System.out.println("Consultando usuario con nombre: " + nombre);
    }
}