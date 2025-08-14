package entities;

    /**
     * Autor: Vanessa de Freitas Ferreira
     * Data: 14/08/2025
     * Projeto: SeuProjetoAqui
     * Descrição: Fazer um programa para ler os valores da largura e altura
     * de um retângulo. Em seguida, mostrar na tela o valor de
     * sua área, perímetro e diagonal. U
     */

    public class Rectangle {
        public double width; //largura
        public double height;//comprimento

        public double area() {
            return height * width;
        }
        public double perimeter() {
            return 2 * (height + width);


        }
        public double diagonal() {
            return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        }



    }
