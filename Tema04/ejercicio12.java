import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println("- - - C U E S T I O N A R I O - - -");
        Scanner opt = new Scanner(System.in);
        Float resultado;
        int puntos = 0;
        
        System.out.println("1.- El chaleco reflectante, ¿Cuándo es obligatorio ponérselo?");
        System.out.println("\n1) Cuando salgo del vehículo en las vías urbanas.");
        System.out.println("\n2) Cuando salgo del vehículo en autopistas y autovías solamente");
        System.out.println("\n3) Cuando salgo del vehículo en vías interurbanas\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 3) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("2.- En una intersección, ¿cuándo está permitido adelantar por la derecha?");
        System.out.println("\n1) Cuando no haya señales de detención obligatoria o ceda el paso.");
        System.out.println("\n2) Cuando el vehículo que va delante va a girar a la izquierda");
        System.out.println("\n3) Cuando no hay señales de vía preferente\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 2) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("3.- ¿Está permitido adelantar a un vehículo que ha señalizado, a su vez que quiere adelantar?");
        System.out.println("\n1) Sí, si después de un tiempo prudencial no adelanta y se lo advierte con las señales acústicas u ópticas.");
        System.out.println("\n2) No, si lo ha señalizado, tiene preferencia.");
        System.out.println("\n3) No, hay que esperar a que termine la maniobra o apague el intermitente.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 1) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("4.- Son remolques ligeros aquellos culla M M.M.A...");
        System.out.println("\n1) Es igual a  750 kg.");
        System.out.println("\n2) No supera los 750 kg.");
        System.out.println("\n3) Supere los 750 kg\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 2) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("5.- Cuando un carril esta delimitado por ambos lados por doble linea discontinua, ¿qué deben hacer los conductores?");
        System.out.println("\n1) Utilizarlo sólo para adelantar a una velocidad máxima de 80 kilómetros por hora.");
        System.out.println("\n2) No circular por él porque la circulación está prohibida.");
        System.out.println("\n3) Entre otras normas, si la circulación está regulada por semáforos de carril, obedecen sus indicaciones.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 3) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("6.- Ciclo es el vehículo de...");
        System.out.println("\n1) Dos ruedas accionado con un motor.");
        System.out.println("\n2) Dos o más ruedas accionado con un motor o con pedales.");
        System.out.println("\n3) Dos ruedas por lo menos, accionado por su conductor mediante pedales o manivelas.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 3) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("7.- Sobre los railes de tranvía, ¿qué está prohibido?");
        System.out.println("\n1) Parar y estacionar.");
        System.out.println("\n2) Estacionar solamente.");
        System.out.println("\n3) Circular.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 1) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("8.- ¿Qué pasa cuando se deja el chaleco reflectante expuesto a la luz?");
        System.out.println("\n1) Nada, la luz no daña el material.");
        System.out.println("\n2) Que pierde sus propiedades reflectantes.");
        System.out.println("\n3) Que cambia de color, aunque mantiene sus funciones reflectantes.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 2) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("9.- Se prohibe circular por autopistas a los..");
        System.out.println("\n1) vehículos que transporten mercancías peligros.");
        System.out.println("\n2) vehículos con remolque.");
        System.out.println("\n3) vehículos que no sean capaz de alcanzar en llano 60 km/h\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 3) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("10.- Los indicadores de dirección, ¿para qué se utilizan?");
        System.out.println("\n1) Únicamente para indicar los cambios de dirección a la derecha o  a la izquierda.");
        System.out.println("\n2) No tienen mucha utilidad salvo en vías con mucho tráfico.");
        System.out.println("\n3) Para comunicarse con los demás conductores.\n");
        System.out.print("Seleccione una opción (1-3): ");
        resultado = opt.nextFloat();
        if (resultado == 3) {
            System.out.println("\n¡Has Acertado!");
            puntos++;
        } else {
            System.out.println("\nHas fallado");
        }
        System.out.println("\nHas obtenido un " + puntos);
    }
}
