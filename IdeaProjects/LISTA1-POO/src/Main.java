

        public class Main {
            public static void main(String[] args) {
                Usuario u = new Usuario("Vanessa", "124");

                if (u.login("Vanessa", "1234")) {
                    System.out.println("Login bem-sucedido! Bem-vinda, " + u.getNome());
                } else {
                    System.out.println("Usuário ou senha inválidos.");
                }
            }
        }



