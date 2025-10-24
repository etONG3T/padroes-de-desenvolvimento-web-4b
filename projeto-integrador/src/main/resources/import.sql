INSERT INTO Categoria (nome) VALUES
('Bebidas'),
('Carnes'),
('Higiene'),
('Limpeza'),
('Outros'),
('Padaria'),
('Laticínios'),
('Frios'),
('Congelados'),
('Farináceos');

INSERT INTO Fabricante (nome) VALUES
('JBS'),
('The Coca-Cola Company'),
('Nestlé'),
('Unilever'),
('P&G'),
('Bunge'),
('Vigor'),
('Aurora'),
('Mãe Terra'),
('Seara');

INSERT INTO Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) VALUES
('Coca-Cola Lata 2 Litros', 20, 12.50, '2025-12-20', 1, 2),
('Picanha', 15, 59.90, '2024-11-15', 2, 1),
('Desodorante Dove', 50, 18.90, '2026-05-10', 3, 4),
('Leite Integral', 80, 5.50, '2025-01-25', 7, 5),
('Manteiga', 30, 8.75, '2025-02-18', 7, 5),
('Pão Francês', 120, 0.70, '2024-12-05', 6, NULL),
('Sabão em Pó Ariel', 40, 25.00, '2026-03-22', 4, 3),
('Massa de Lasanha', 25, 6.99, '2025-08-30', 10, 6),
('Salsicha Hot-Dog', 90, 9.99, '2025-01-10', 8, 7),
('Frango Congelado', 35, 18.50, '2025-06-01', 9, 8);

INSERT INTO Cliente (nome, cpf) VALUES
('Otavio Volpe', '39439061239'),
('Hernandes de Castro', '52252119745'),
('Gabriel Hernandes', '45678901234'),
('Luiz Felipe', '98765432109'),
('Maria Eloisa', '23456789012'),
('Eduardo Pereira', '87654321098'),
('Mariana Ribeiro', '54321098765'),
('Gustavo Ferreira', '90123456789'),
('Patrícia Almeida', '67890123456'),
('Vitor Martins', '34567890123');

INSERT INTO Funcionario (nome, cpf) VALUES
('Carlos', '12345678901'),
('Ana', '10987654321'),
('Pedro', '23456789012'),
('Lucia', '87654321098'),
('Rafael', '54321098765'),
('Camila', '90123456789'),
('Rodrigo', '67890123456'),
('Beatriz', '34567890123'),
('João', '11223344556'),
('Isabela', '99887766554');

INSERT INTO Venda (horario, valorTotal, quantidadeTotal, cliente_codigo, funcionario_codigo) VALUES
('2024-10-01 14:30:00', 72.40, 3, 1, 1),
('2024-10-01 15:00:00', 59.90, 1, 2, 1),
('2024-10-02 11:00:00', 37.80, 2, 3, 2),
('2024-10-02 12:45:00', 8.75, 1, 4, 3),
('2024-10-03 16:20:00', 16.80, 4, 5, 4),
('2024-10-04 09:30:00', 25.00, 1, 6, 5),
('2024-10-04 10:15:00', 6.99, 1, 7, 6),
('2024-10-05 18:05:00', 19.98, 2, 8, 7),
('2024-10-05 19:40:00', 55.50, 10, 9, 8),
('2024-10-06 08:50:00', 18.50, 1, 10, 1);

INSERT INTO ItemVenda (valorParcial, quantidadeParcial, produto_codigo) VALUES
(25.00, 2, 1),
(59.00, 1, 2),
(37.80, 2, 3),
(8.75, 1, 4),
(2.80, 4, 6),
(25.00, 1, 7),
(6.99, 1, 8),
(19.98, 2, 9),
(55.50, 10, 10);