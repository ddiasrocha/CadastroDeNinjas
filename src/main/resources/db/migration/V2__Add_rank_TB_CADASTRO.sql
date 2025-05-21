 -- Migrations para adicionar a coluna de RANK na tabel de cadastros
 ALTER TABLE tb_cadastro
 ADD COLUMN rank VARCHAR(255);
--uma tabela de migration é imutavel não se consegue adicionar mais outra tabela