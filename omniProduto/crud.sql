PGDMP                         z            crud    14.3    14.3     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16454    crud    DATABASE     d   CREATE DATABASE crud WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE crud;
                postgres    false            �            1259    16455    produto    TABLE     �   CREATE TABLE public.produto (
    codproduto integer NOT NULL,
    nome character varying(100),
    descricao character varying(200),
    preco numeric,
    datainsercao integer,
    marca character varying(250)
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �          0    16455    produto 
   TABLE DATA           Z   COPY public.produto (codproduto, nome, descricao, preco, datainsercao, marca) FROM stdin;
    public          postgres    false    209   �       \           2606    16461    produto keycodproduto 
   CONSTRAINT     [   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT keycodproduto PRIMARY KEY (codproduto);
 ?   ALTER TABLE ONLY public.produto DROP CONSTRAINT keycodproduto;
       public            postgres    false    209            �   �  x�E�Mn�0���S��- $EJ�Rʏ@n�n���&!2Htg�E��M�0�E�$'���f0|����\��a�-��e�g��X���0.���vg7��u���׾r%(.{ڃ��SIL�tvOB��Y:w�������fC:`��7��ݡ��pmzě��O]c�>c%ǌ�2����a�+��1�&Y��w�Q�����ǅ]X���1�����g�7��u�k!y���F���V^���8̧���G�?���䨛qH�yIz�[�x�}���E8�FE�AzuJ"(���������i���Z�T �F��l�H�ߝ�R�pfj�L��K�ToQm�����C���k��EF!ba	M̋�4%
&�V�5x���*Y�)>���G��%Կ<'��?�k��     