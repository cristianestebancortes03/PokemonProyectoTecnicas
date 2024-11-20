package Presentacion;


public enum TipoPokemon {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA,
    NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA;

    public static double objetenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                //Switch 1  
                switch (defensor) {

                    case VENENO, ELECTRICO, PSIQUICO, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, FANTASMA:
                        return 1.0;
                    case PLANTA, BICHO, HIELO:
                        return 2.0;
                    case AGUA, ROCA, ACERO:
                        return 0.5;
                }

            case AGUA:
                //Switch 2
                switch (defensor) {

                    case AGUA, VENENO, ELECTRICO, PSIQUICO, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case FUEGO, ROCA:
                        return 2.0;
                    case PLANTA:
                        return 0.5;
                }

            case PLANTA:
                //Switch 3 

                switch (defensor) {

                    case PLANTA, ELECTRICO, PSIQUICO, NORMAL, VOLADOR, HADA, LUCHA, HIELO, FANTASMA:
                        return 1.0;
                    case AGUA, ROCA, TIERRA:
                        return 2.0;
                    case FUEGO, VENENO, ACERO, BICHO:
                        return 0.5;
                }

            case VENENO:
                //Switch 4

                switch (defensor) {

                    case FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, TIERRA, NORMAL, VOLADOR, LUCHA, ACERO, BICHO, HIELO:
                        return 1.0;
                    case PLANTA, HADA:
                        return 2.0;
                    case ROCA, FANTASMA:
                        return 0.5;
                }

            case ELECTRICO:
                //Switch 5

                switch (defensor) {

                    case FUEGO, VENENO, ELECTRICO, PSIQUICO, ROCA, NORMAL, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case AGUA, VOLADOR:
                        return 2.0;
                    case PLANTA:
                        return 0.5;
                    case TIERRA:
                        return 0;

                }

            case PSIQUICO:
                //Switch 6

                switch (defensor) {

                    case FUEGO, AGUA, PLANTA, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case VENENO, LUCHA:
                        return 2.0;
                }

            case ROCA:
                //Switch 7

                switch (defensor) {

                    case AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, HADA, FANTASMA:
                        return 1.0;
                    case FUEGO, VOLADOR, ACERO, BICHO, HIELO:
                        return 2.0;
                    case LUCHA:
                        return 0.5;
                }

            case TIERRA:
                //Switch 8

                switch (defensor) {

                    case AGUA, PLANTA, PSIQUICO, TIERRA, NORMAL, HADA, LUCHA, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case FUEGO, VENENO, ROCA, ACERO:
                        return 2.0;
                    case VOLADOR:
                        return 0.5;
                    case ELECTRICO:
                        return 0;
                }

            case NORMAL:
                //Switch 9
                switch (defensor) {

                    case FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO:
                        return 1.0;
                    case FANTASMA:
                        return 0;
                }

            case VOLADOR:
                //Switch 10

                switch (defensor) {

                    case FUEGO, AGUA, VENENO, PSIQUICO, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, HIELO, FANTASMA:
                        return 1.0;
                    case PLANTA, ELECTRICO, BICHO:
                        return 2.0;
                    case ROCA:
                        return 0.5;
                }

            case HADA:
                //Switch 11

                switch (defensor) {

                    case FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case PSIQUICO:
                        return 2.0;

                }

            case LUCHA:
                //Switch 12

                switch (defensor) {

                    case FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, TIERRA, VOLADOR, LUCHA, ACERO, BICHO:
                        return 1.0;
                    case ROCA, NORMAL, HIELO:
                        return 2.0;
                    case PSIQUICO, HADA, FANTASMA:
                        return 0.5;

                }

            case ACERO:
                //Switch 13

                switch (defensor) {

                    case AGUA, PLANTA, VENENO, ELECTRICO, TIERRA, NORMAL, VOLADOR, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case FUEGO, ROCA, HADA, LUCHA:
                        return 2.0;
                    case PSIQUICO:
                        return 0.5;

                }

            case BICHO:
                //Switch 14

                switch (defensor) {

                    case FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, HADA, LUCHA, BICHO, HIELO:
                        return 1.0;
                    case PLANTA, VOLADOR:
                        return 2.0;
                    case ACERO, FANTASMA:
                        return 0.5;

                }

            case HIELO:
                //Switch 15

                switch (defensor) {

                    case FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, ROCA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA:
                        return 1.0;
                    case PLANTA, TIERRA:
                        return 2.0;

                }

            case FANTASMA:
                //Switch 16

                switch (defensor) {

                    case FUEGO, AGUA, PLANTA, ELECTRICO, PSIQUICO, ROCA, TIERRA, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO:
                        return 1.0;
                    case FANTASMA:
                        return 2.0;
                    case VENENO:
                        return 0.5;
                    case NORMAL:
                        return 0;

                }
                break;
            default:
                throw new AssertionError();

        }

        return 0; // Daño neutro por defecto
    }
}
