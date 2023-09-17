# Calculadora-Consumo-Energia
 # Calculadora de Consumo de Energia

## Descrição

Este projeto é uma Calculadora de Consumo de Energia que permite estimar o consumo de energia de dispositivos com base em informações como potência em Watts, tempo de uso e tarifa de energia elétrica vigente. O projeto é composto por três classes principais: `ViewWelcome`, `ViewCalculo`, e `Calculo`.

## Funcionalidades

1. **Tela de Boas-Vindas (`ViewWelcome`):** Exibe uma tela inicial de boas-vindas que fornece informações sobre como a calculadora funciona e permite avançar para a tela de cálculo.

2. **Tela de Cálculo (`ViewCalculo`):** Permite ao usuário inserir informações sobre o dispositivo, como nome, potência em Watts, valor do kWh e tempo de uso diário. Ao pressionar o botão "Calcular", a calculadora estimará o consumo de energia do dispositivo e exibirá os resultados.

3. **Classe de Cálculo (`Calculo`):** Realiza os cálculos com base nas informações inseridas pelo usuário e exibe os resultados em uma caixa de diálogo.

## Tecnologias Utilizadas

- Java: Linguagem de programação utilizada no projeto.
- Swing: Biblioteca gráfica para criação de interfaces gráficas.
- JOptionPane: Para exibição de caixas de diálogo.
- DecimalFormat: Para formatar valores monetários.
- UIManager: Para personalização da interface gráfica.

## Como Executar

1. Compile e execute o projeto Java.
2. A tela de boas-vindas será exibida.
3. Clique no botão "Avançar" para acessar a tela de cálculo.
4. Preencha as informações necessárias sobre o dispositivo e clique em "Calcular".
5. Os resultados do cálculo de consumo de energia serão exibidos em uma caixa de diálogo.

## Observação

Este projeto foi desenvolvido para fins educacionais e de demonstração. Sinta-se à vontade para personalizá-lo e estendê-lo conforme necessário para atender aos requisitos específicos do seu projeto.

## Licença

Este projeto é licenciado sob a MIT License. Consulte o arquivo LICENSE para obter detalhes.

## Autor

Bia ⬅️

## Feedback e Contribuições

Feedback e contribuições são sempre bem-vindos. Sinta-se à vontade para relatar problemas, fazer melhorias ou contribuir para este projeto.

``` mermaid
classDiagram
    class ViewWelcome {
        +createAndShowWelcomeView()
        +openCalculoView()
    }
    class ViewCalculo {
        -JTextField txtItem
        -JTextField txtPotencia
        -JTextField txtValorKwh
        -JTextField txtTempoUso
        -Calculo calculo
        +ViewCalculo()
        -initComponents()
        +calcular()
    }
    class Calculo {
        +calculoConsumoEnergia(double potencia, double tempoUso, double precoKwh, String nomeItem)
    }
    ViewCalculo --|> Calculo
    ViewWelcome --|> ViewCalculo
```
