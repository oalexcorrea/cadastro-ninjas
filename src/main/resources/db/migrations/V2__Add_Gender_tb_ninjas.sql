-- Migration to add GENDER column on tb_ninjas

ALTER TABLE tb_ninjas
ADD COLUMN gender VARCHAR(255);