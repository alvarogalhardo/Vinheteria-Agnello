# Vinheria Agnello - Sistema JSP/Servlet

Este projeto implementa o sistema de e-commerce da Vinheria Agnello usando JSP e Servlets Java.

## Estrutura do Projeto

```
JSP/
├── WEB-INF/
│   ├── classes/
│   │   └── com/vinheria/
│   │       ├── controller/     # Servlets
│   │       ├── model/          # Modelos de dados
│   │       ├── dao/            # Data Access Objects
│   │       └── util/           # Utilitários
│   └── web.xml                 # Configuração da aplicação
├── index.jsp                   # Página inicial
├── catalogo.jsp               # Catálogo de produtos
├── produto.jsp                # Detalhes do produto
├── carrinho.jsp               # Carrinho de compras
├── cliente.jsp                # Área do cliente
├── error.jsp                  # Página de erro
├── styles.css                 # Estilos CSS
└── README.md                  # Este arquivo
```

## Funcionalidades Implementadas

### 1. Páginas JSP
- **index.jsp**: Página inicial com produtos em destaque
- **catalogo.jsp**: Catálogo com filtros e paginação
- **produto.jsp**: Detalhes do produto com avaliações
- **carrinho.jsp**: Carrinho de compras com funcionalidades completas
- **cliente.jsp**: Área do cliente com múltiplas seções

### 2. Servlets
- **IndexServlet**: Controla a página inicial
- **CatalogoServlet**: Gerencia o catálogo e filtros
- **ProdutoServlet**: Exibe detalhes do produto
- **CarrinhoServlet**: Gerencia o carrinho de compras
- **ClienteServlet**: Controla a área do cliente

### 3. Modelos de Dados
- **Produto**: Representa um produto/vinho
- **Cliente**: Dados do cliente
- **ItemCarrinho**: Item no carrinho de compras
- **Pedido**: Pedido realizado
- **Avaliacao**: Avaliação de produtos

### 4. DAOs (Data Access Objects)
- **ProdutoDAO**: Operações com produtos
- **ClienteDAO**: Operações com clientes
- **PedidoDAO**: Operações com pedidos
- **AvaliacaoDAO**: Operações com avaliações

## Como Executar

### Pré-requisitos
- Java 8 ou superior
- Apache Tomcat 9.0 ou superior
- IDE (Eclipse, IntelliJ IDEA, etc.)

### Passos para Execução

1. **Importar o projeto**:
   - Abra sua IDE
   - Importe o projeto como "Dynamic Web Project"

2. **Configurar o Tomcat**:
   - Configure o Apache Tomcat no seu IDE
   - Defina o projeto para rodar no Tomcat

3. **Executar a aplicação**:
   - Execute o projeto no servidor Tomcat
   - Acesse: `http://localhost:8080/JSP/`

### URLs Disponíveis

- `/` ou `/index.jsp` - Página inicial
- `/catalogo` - Catálogo de produtos
- `/produto?id=1` - Detalhes do produto
- `/carrinho` - Carrinho de compras
- `/cliente` - Área do cliente

## Funcionalidades do Sistema

### Catálogo
- Filtros por tipo, país, faixa de preço
- Ordenação por preço, nome, avaliação
- Paginação de resultados
- Visualização em grade ou lista

### Produto
- Informações técnicas detalhadas
- Avaliações de clientes
- Produtos relacionados
- Adicionar ao carrinho
- Sistema de favoritos

### Carrinho
- Adicionar/remover produtos
- Alterar quantidades
- Aplicar cupons de desconto
- Cálculo de frete
- Opções de entrega

### Área do Cliente
- Dashboard com resumo
- Histórico de pedidos
- Gerenciamento do Clube Agnello
- Recomendações personalizadas
- Lista de favoritos
- Programa de pontos

## Tecnologias Utilizadas

- **Java 8+**: Linguagem de programação
- **JSP**: JavaServer Pages para apresentação
- **Servlets**: Controle de requisições
- **HTML5/CSS3**: Interface do usuário
- **JavaScript**: Interatividade do cliente
- **Apache Tomcat**: Servidor de aplicação

## Características Técnicas

- **Arquitetura MVC**: Separação clara entre Model, View e Controller
- **Sessões HTTP**: Gerenciamento de estado do usuário
- **Filtros**: Configuração de encoding UTF-8
- **Tratamento de Erros**: Páginas de erro personalizadas
- **Responsivo**: Interface adaptável a diferentes dispositivos

## Dados de Exemplo

O sistema inclui dados de exemplo para demonstração:
- 3 produtos de vinho com informações completas
- 1 cliente de exemplo
- 2 pedidos de exemplo
- 3 avaliações de exemplo

## Próximos Passos

Para um ambiente de produção, considere implementar:
- Conexão com banco de dados real
- Sistema de autenticação robusto
- Integração com gateway de pagamento
- Sistema de notificações
- Logs de auditoria
- Testes automatizados

## Suporte

Para dúvidas ou problemas, consulte a documentação do Java EE ou entre em contato com a equipe de desenvolvimento.

