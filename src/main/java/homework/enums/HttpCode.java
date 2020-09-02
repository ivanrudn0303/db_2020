package homework.enums;

public enum HttpCode {
    INFORMATIONAL(){
        @Override
        void result(){
            System.out.println("Informational");
        }
    },
    SUCCESS(){
        @Override
        void result() {
            System.out.println("Success");
        }
    },
    REDIRECTION(){
        @Override
        void result() {
            System.out.println("Redirection");
        }
    },
    CLIENT_ERROR(){
        @Override
        void result() {
            System.out.println("Client Error");
        }
    },
    SERVER_ERROR(){
        @Override
        void result() {
            System.out.println("Server Error");
        }
    };

    abstract void result();
}