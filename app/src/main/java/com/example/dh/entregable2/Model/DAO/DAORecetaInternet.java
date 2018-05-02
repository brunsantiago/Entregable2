package com.example.dh.entregable2.Model.DAO;

import com.example.dh.entregable2.Model.POJO.Receta;
import com.example.dh.entregable2.R;

import java.util.ArrayList;
import java.util.List;

public class DAORecetaInternet {

    public List<Receta> obtenerRecetaDeInternet(){

        List<Receta> listaDeRecetas = new ArrayList<>();

        listaDeRecetas.add(new Receta(1,"Milanesa de Cerdo","Esta receta de milanesa de cerdo es ideal para principiantes. Sigue todo el paso a paso para que te quede perfecta.",
                "1/2 taza de crema agria\n" +
                "1/2 cucharadita de mostaza (puede ser Dijón)\n" +
                "3 huevos\n" +
                "1 taza de harina\n" +
                "3 tazas de pan molido\n" +
                "8 chuletas de cerdo sin hueso (aplanadas y sin hueso o bisteces)\n" +
                "1 taza de aceite vegetal","Mezcle la crema y la mostaza y sazone con sal y pimienta.\n" +
                "Bata los huevos en un plato hondo.\n" +
                "Ponga la harina en otro plato hondo y sazone con 1 cucharadita de sal, y 1/4 de cucharadita de pimienta.\n" +
                "Ponga el pan molido en otro plato hondo.\n" +
                "Sazone las chuletas de cerdo con sal y pimienta por los dos lados.\n" +
                "Pase la carne por la harina, cubriendo bien los dos lados.\n" +
                "Luego pase por el huevo y cubra.\n" +
                "Finalmente cubra en el pan molido hasta que esté totalmente cubierta.\n" +
                "Repita con todas las chuletas de cerdo.\n" +
                "Ponga el aceite en un sartén sobre fuego medio.\n" +
                "Ponga la mitad de las chuletas hasta que se doren (2 minutos por cada lado).\n" +
                "Repita con el resto de las chuletas.\n" +
                "Ponga sobre toallas de servilleta para quitar la grasa de exceso.", R.drawable.milanesadecerdo,"carnes"));
        listaDeRecetas.add(new Receta(2,"Puntas de Res en Salsa de Champiñón","Agrégale a tus puntas de res todo el sabor con una exquisita y cremosa salsa de champiñones que le va a dar una textura increíblemente deliciosa que a todo mundo le gusta. Prepáralas en tu siguiente reunión o para la hora de la comida","4 cucharadas de aceite\n" +
                "3 tazas de punta de filete cortadas en tiras delgadas\n" +
                "1 cebolla fileteada muy delgada\n" +
                "1 diente de ajo finamente picado\n" +
                "2 jitomates sin semilla, y cortado en cuadritos pequeños\n" +
                "3 chiles serranos finamente picado\n" +
                "2 latas de crema de champiñones Campbell's ®\n" +
                "2 pizcas de sal\n" +
                "4 cucharadas de cilantro finamente picado\n","Calienta el aceite en una sartén profundo a fuego alto, fríe las puntas de res 5 minutos o hasta que estén doraditas. Agrega la cebolla, el ajo y cuece por 2 minutos más. Agrega el jitomate y el chile termina de cocer por 3 minutos más\n" +
                "Agrega la crema de champiñón y una lata de agua, baja la temperatura cocina por 10 minutos más y sazona.\n" +
                "Antes de servir agrega el cilantro y mezcla.\n",R.drawable.carneconhongos,"carnes"));
        listaDeRecetas.add(new Receta(3,"Rollo de Papa con Pollo Gratinado","Es una receta para disfrutarla en familia y estar unidos durante el momento de la comida ya que es muy deliciosa y perfecta para compartir. También la podemos preparar en una reunión con los amigos, prepara esta deliciosa receta de rollo de papa con pollo.","2 pechugas de pollo\n" +
                "908 gramos de papa\n" +
                "250 gramos de queso parmesano\n" +
                "500 gramos de queso mozzarella\n" +
                "500 gramos de tocino\n" +
                "3 ajos\n" +
                "4 ramitas de tomillo\n" +
                "cilantros al gusto\n" +
                "4 huevos\n" +
                "1 sobre de champiñón en salsa\n" +
                "sal al gusto\n" +
                "pimientas al gusto\n","Adobar las pechugas con el ajo, sal, pimienta y el tomillo.\n" +
                "Luego cocerla en medio litro de agua, hasta que este muy bien cocida.\n" +
                "Desmecharla muy bien y mezclarla con la salsa de champiñones preparada según las instrucciones del sobre.\n" +
                "Cocer las papas previamente peladas, en un litro de agua. Hasta que estén cocinadas.\n" +
                "Hacer un puré con las papas y agregar el cilantro previamente picado y los huevos, mezclar muy bien.\n" +
                "Expandir el puré en una mesa.\n" +
                "Poner una capa de pollo, una de tocino y que so mozzarella.\n",R.drawable.pollogratinado,"carnes"));
        listaDeRecetas.add(new Receta(4,"Ensalada Tricolor","Te presentamos una deliciosa ensalada tricolor, sencilla de preparar y muy sabrosa. Es una preparación muy rápida y que es el acompañamiento perfecto para cualquier platillo fuerte.","2 cucharaditas de Knorr® Suiza Caldo de Pollo\tgranulado\n" +
                "1 manojo de espinaca\n" +
                "4 hojas de lechuga francesa lavada y desinfectada\n" +
                "1/2 taza de jitomate cherry en mitades\n" +
                "1/2 taza de pimiento rojo desvenado y despepitado, cortado en tiras muy delgadas\n" +
                "1 taza de coliflor previamente cocida, ramos pequeños\n" +
                "4 cucharaditas de vinagre de manzana","Partir la espinaca y la lechuga con las manos en trozos pequeños del tamaño de un bocado. Después colocarla en un recipiente.\n" +
                "Colocar los demás vegetales junto con las hojas verdes en el recipiente. Mezclar todo muy bien.\n" +
                "Añadir el aceite, jugo, vinagre y posteriormente las cucharaditas de Knorr® Suiza Caldo de Pollo. Mezclar e integrar bien para sazonar uniformemente.",R.drawable.ensaladatricolor,"ensaladas"));
        listaDeRecetas.add(new Receta(5,"Ensalada Fresca de Atun","Una opción, rica, fresca, saludable y rápida para los días de mucho calor.","2 latas de Atún\n" +
                "1 pepino grande, sin cáscara y sin semillas, picado\n" +
                "1 taza de pimiento morrón verde, rojo y amarillo picado\n" +
                "1 taza de jitomate picado, sin semillas\n" +
                "3 chiles serranos sin semillas, finamente picados\n" +
                "1/2 lechuga finamente picada\n" +
                "2 limones\n" +
                "1 chorrito de aceite de oliva\n" +
                "pizcas de sal y pimienta\n" +
                "1 aguacate para acompañar\n" +
                "1/2 taza de cebolla morada finamente picada\n" +
                "1/4 de taza de vinagre de manzana","Coloca en un bowl el atún drenado, el pepino , los pimientos, el jitomate, la cebolla, los chiles serranos y la lechuga. Mezcla todo perfectamente.\n" +
                "Aparte combina el jugo de los limones, el vinagre de manzana, el chorrito de aceite de oliva, sal y pimienta, y agrégalos a la mezcla anterior.\n" +
                "Puedes preparar unos ricos taquitos de lechuga totalmente dietéticos o bien unas ricas tostadas acompañadas de unas rebanadas de aguacate.",R.drawable.ensaladaatun,"ensaladas"));
        listaDeRecetas.add(new Receta(6,"Ensalada de Coditos","Hoy prepare una receta fácil y sabrosa Ensalada de Coditos con Jamón, contiene carbohidratos y proteínas.","1 paquete de pasta de coditos de 200 gramos\n" +
                "2 cucharadas de aceite\n" +
                "2 litros de agua\n" +
                "1 hoja de laurel\n" +
                "1 cubo de caldo de pollo\n" +
                "100 mililitros de crema\n" +
                "1/4 de kilo de jamón\n" +
                "1 taza de grano de elote o granos de maíz de lata (opcional)\n" +
                "4 cucharadas de mayonesa\n" +
                "1 trozo de apio\n" +
                "1 pizca de sal\n" +
                "50 gramos de lechuga","Los pasos para hacer la Ensalada de Coditos con Jamón: Ponemos a calentar el agua con la hoja de laurel y el cubo de caldo de pollo, hasta que esté caliente el agua agregamos a pasta de coditos y el aceite.\n" +
                "Cuando ya esté cocida la retiramos del fuego, la escurrimos, la enjuagamos con agua fría y la volvemos a escurrir, retiramos la hoja de laurel. Reservamos.\n" +
                "Lavamos y ponemos a desinfectar las hojas de lechuga enteras.\n" +
                "Cortamos el jamón en cuadritos y el apio picado finamente.\n" +
                "En un refractario ponemos la pasta agregamos, el jamón, los granos de maíz, el apio, la crema, la mayonesa y la sal.\n" +
                "Revolvemos todos los ingredientes, tapamos y ponemos en el refrigerador ½ hora antes de servir.\n" +
                "Servimos la Ensalada de Coditos con Jamón sobre hojas de lechuga.\n" +
                "Disfruta de esta rica Ensalada de Coditos con Jamón con un toque diferente.",R.drawable.ensaladadecoditos,"ensaladas"));
        listaDeRecetas.add(new Receta(7,"Pasta Cremosa con Pimientos y Pollo","Prepara este rico, fácil y delicioso Spaghetti Vegetales Lucchetti® con pollo a la parrilla y paprika en una salsa cremosita de pimiento asado, con queso parmesano y un toque de perejil fresco. ¡Te encantará!","2 litros de agua\n" +
                "1 paquete de Spaghetti Vegetales Lucchetti®\n" +
                "1 cucharada de aceite de oliva\n" +
                "3 hojas de laurel seco\n" +
                "2 cucharadas de sal\n" +
                "2 piezas de pimiento rojo\n" +
                "2 piezas de pechuga de pollo\n" +
                "1 pizca de sal y pimienta\n" +
                "1 cucharada de paprika\n" +
                "1 taza de crema ácida\n" +
                "2 cucharadas de mantequilla\n" +
                "1 cucharada de ajo finamente picado\n" +
                "1 pieza de pimiento rojo cortado en cubitos medianos\n" +
                "1 taza de queso parmesano\n" +
                "1 pizca de perejil finamente picado\n" +
                "al gusto de jitomate cherry para decorar","Calienta el agua en una ollita a fuego alto hasta que llegue a punto de ebullición, cocina el Spaghetti Vegetales Lucchetti® con el aceite de oliva, las hojas de laurel y la sal hasta que esté al dente.\n" +
                "Calienta una parrilla a fuego alto y cocina los pimientos junto con la pechuga de pollo, sazona con la sal, la pimienta y la paprika a tu gusto. Corta la pechuga y reserva. Suda los pimientos, límpialos y reserva.\n" +
                "Licúa los pimientos con la crema. Reserva.\n" +
                "Calienta una sartén a fuego medio con la mantequilla, cocina el ajo con la cebolla, el pimiento, agrega la salsa, cocina y sazona a tu gusto. Añade el queso parmesano y la pasta, mezcla hasta que se incorpore bien.\n" +
                "Sirve la pasta con trozos de pollo y perejil fresco. Decora con jitomates cherry.",R.drawable.pastasconpollo,"pastas"));
        listaDeRecetas.add(new Receta(8,"Lasaña con Salsa Boloñesa","La tradicional lasaña con carne boloñesa y salsa bechamel está llena de sabor, con deliciosas capas de carne y salsa que entre delgadas láminas de pasta y cubierta con queso que la hacen simplemente exquisita.","2 cucharadas de aceite de oliva\n" +
                "500 gramos de carne de res\n" +
                "1/4 de pieza de cebolla finamente picada\n" +
                "2 dientes de ajo finamente picados\n" +
                "1/2 taza de Puré de Tomate\n" +
                "1/4 de taza de vino tinto\n" +
                "3 piezas de jitomate sin cáscara ni semillas, en cubos\n" +
                "1/2 taza de zanahoria en cubitos\n" +
                "1/2 taza de apio en cubitos\n" +
                "1/2 taza de caldo de res\n" +
                "2 hojas de laurel\n" +
                "1 cucharadita de tomillo\n" +
                "1 cucharadita de orégano\n" +
                "1 cucharada de sal\n" +
                "1/2 cucharadita de pimienta blanca opcional\n" +
                "2 cucharadas de mantequilla para la salsa bechamel\n" +
                "1/8 de pieza de cebolla\n" +
                "3 cucharadas de harina para la salsa bechamel\n" +
                "1 taza de leche para la salsa bechamel\n" +
                "1 cucharadita de sal para la salsa bechamel\n" +
                "1 pizca de nuez moscada\n" +
                "8 piezas de pasta para lasaña\n" +
                "1/2 taza de queso manchego","Precalienta el horno a 180° C y engrasa un refractario para horno.\n" +
                "Para la salsa boloñesa, en una olla o sartén profundo fríe la carne molida con aceite de oliva hasta que esté cocida. Agrega la cebolla y el ajo y cocina unos minutos.\n" +
                "Agrega el puré de tomate y deglasa con vino tinto. Agrega las verduras y cocina 3 minutos más.\n" +
                "Añade el caldo de res, las especias y cocina a fuego bajo por lo menos 30 minutos, moviendo constantemente. Rectifica sazón y reserva.\n" +
                "Para la salsa bechamel, en una ollita a fuego medio cocina la mantequilla y la cebolla hasta que esté transparente. Agrega la harina y calienta hasta que esté dorada. Incorpora la leche y mueve constantemente hasta que espese. Sazona con sal y nuez moscada. Reserva.\n" +
                "Arma la lasaña colocando las láminas de pasta, un poco de salsa bechamel y un poco de salsa boloñesa. Repite las capas hasta llenar el molde, termina con queso manchego.\n" +
                "Hornea por 20 minutos hasta que la pasta esté cocida y el queso derretido. Sirve de inmediato.",R.drawable.lasagna,"pastas"));
        listaDeRecetas.add(new Receta(9,"Espagueti Teppanyaki","En esta receta encontrarás mi especialidad, un delicioso Espagueti Teppanyaki, es una receta con inspiración oriental, donde cada vez que la preparo a toda mi familia le encanta. Vas a ver que rico queda.","2 paquetes de spaghetti 200 gramos\n" +
                "1 pieza de pepino\n" +
                "1/2 pieza de jícama\n" +
                "1 pieza de pimiento morrón\n" +
                "1 pieza de brócoli mediana\n" +
                "5 piezas de zanahoria\n" +
                "1 rama de apio\n" +
                "1 manojo de cebollín\n" +
                "3 dientes de ajo\n" +
                "1/2 taza de salsa de anguila al gusto\n" +
                "1/2 taza de salsa de soya al gusto\n" +
                "1/2 taza de salsa de ostión al gusto","Cocer el espagueti a fuego medio por 15 minutos.\n" +
                "Cortar todas las verduras en corte Juliana. Poner a cocer el brócoli por unos 3 a 5 minutos. El ajo se pica lo más fino que se pueda.\n" +
                "Le añadimos aceite de oliva al wok y le agregas el ajo finamente picado , añadimos la cebolla y apio y lo dejamos saltear . Añadimos las verduras faltantes. Agregamos el espagueti. Sazonar con salsa de soya, ostión y anguila",R.drawable.spaguetti,"pastas"));
        listaDeRecetas.add(new Receta(10,"Flan Napolitano Tradicional","Esta receta de Flan Napolitano tradicional no puede faltar en tu recetario de repostería.","1 lata de leche evaporada\n" +
                "1 lata de leche condensada\n" +
                "5 piezas de huevo enteros\n" +
                "1 cucharadita de extracto de vainilla\n" +
                "6 cucharadas de azúcar\n" +
                "1 pizca de canela en polvo opcional\n" +
                "1 lata de media crema (opcional)\n" +
                "1 pieza de queso crema 190 g (opcional)","Precalienta el horno a 175 ° C,\n" +
                "Espolvorea el azúcar en el fondo del molde en donde lo vas a cocer y quémala sobre la hornilla de la estufa, deja enfriar.\n" +
                "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde que ya estará el azúcar frío y duro.\n" +
                "Mételo al horno en baño María ( dentro de otro molde con un poco de agua) cuida que no le entre agua al flan. Si no quieres que se dore tápalo con papel aluminio.\n" +
                "Déjalo en el horno por 45 minutos aproximadamente a 170° y hasta que le piques con un cuchillo y este salga limpio. Si en ese momento lo quieres dorar quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigerelo y desmoldelo, disfrútelo frío.",R.drawable.flan,"postres"));
        listaDeRecetas.add(new Receta(11,"Lemon Pie con Merengue","Este tipo de pay de limón va relleno de un pudin de limón cremoso y decorado con merengue, ¡delicioso y refrescante!","masas para tarta\n" +
                "1/2 taza de azúcar\n" +
                "1 cucharada de ralladura de limón\n" +
                "6 cucharadas de mantequilla\n" +
                "6 yemas de huevo\n" +
                "3/4 de taza de clara de huevo\n" +
                "1 taza de azúcar\n" +
                "1/2 taza de jugo de limón","Pre-cocine la masa para la tarta a 350 F (190C), picando el centro con un tenedor, poniendo un papel encerado encima y rellenando con frijoles (para evitar que se deforme). Cocínelo por 25 minutos, quite los frijoles y el papel encerado y deje que se enfríe.\n" +
                "Mezcle el azúcar, el jugo de limón, la ralladura de limón y la mantequilla en un sartén hasta que hierva, moviendo con una cuchara de madera. Quite la ralladura de limón (colando la mezcla). Bata las yemas de huevo con un batidor de globo hasta que estén liquidas. Agregue 1/4 de la mezcla de yemas a la mezcla de limón. Regrese la mezcla al sartén y espere a que hierva. Incorpore con un batidor de globo el resto de las yemas. Siga moviendo constantemente con el batidor de globo hasta que se espese la mezcla y este a punto de hervir. Ponga el relleno de limón en un recipiente y tape con un plástico directo con la mezcla (para evitar que se forme una nata encima). Refrigere y reserve.\n" +
                "Ponga la mezcla de limón sobre la tarta que se horneo. Reserve.\n" +
                "Para preparar el merengue, bata las claras con el azúcar hasta punto de turrón. Ponga la mitad del merengue sobre la tarta. Ponga el resto del merengue en una dulla y haga \"picos\" sobre el merengue, para decorar la tarta.\n" +
                "Cocine la tarta a 450 F (230°C) para que se dore el merengue.",R.drawable.lemonpie,"postres"));
        listaDeRecetas.add(new Receta(12,"Pie de Queso con Zarzamora","Con esta receta puedes preparar un delicioso Pay de Queso con Zarzamora, puedes cambiar la mermelada de Zarzamora por la del sabor de tu gusto y acompañarlo con Frutas frescas o en Almíbar.","1 lata de leche condensada\n" +
                "1 lata de leche evaporada\n" +
                "1 barra de mantequilla\n" +
                "170 gramos de galleta\n" +
                "1 1/2 barras de queso crema tipo Philadelphia\n" +
                "3 huevos\n" +
                "6 tazas de mermelada de zarzamora","Horno Precalentado a 180 °C por 10 minutos.\n" +
                "Tritura las galletas y derretir la mantequilla.\n" +
                "Mezclar las galletas con la mantequilla y poner dicha mezcla en un molde para pay.\n" +
                "Mezclar los huevos con la leche evaporada, la leche condensada,y el queso crema.\n" +
                "Vertir la mezcla anterior en el molde para pay y meter al horno,( previamente calentado) por 30 minutos.\n" +
                "Refrigerar por media hora.\n" +
                "Agregar la mermelada de zarzamora para decorar y servir.",R.drawable.piezarzamora,"postres"));

        return listaDeRecetas;
    }

}
