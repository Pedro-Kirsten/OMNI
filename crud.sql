PGDMP          6                z            postgres    14.5    14.5     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    13754    postgres    DATABASE     h   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE postgres;
                postgres    false            �           0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    3318                        3079    16384 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                   false            �           0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                        false    2            �            1259    16401    loja    TABLE     �   CREATE TABLE public.loja (
    "idLoja" integer[] NOT NULL,
    cnpj character varying NOT NULL,
    "nomeLoja" character varying NOT NULL,
    telefone character varying,
    localizacao character varying NOT NULL
);
    DROP TABLE public.loja;
       public         heap    postgres    false            �            1259    16394    produto    TABLE     �   CREATE TABLE public.produto (
    codproduto integer NOT NULL,
    nome character varying(100),
    descricao character varying(200),
    preco numeric,
    datainsercao integer,
    marca character varying(250)
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �          0    16401    loja 
   TABLE DATA           Q   COPY public.loja ("idLoja", cnpj, "nomeLoja", telefone, localizacao) FROM stdin;
    public          postgres    false    211   �       �          0    16394    produto 
   TABLE DATA           Z   COPY public.produto (codproduto, nome, descricao, preco, datainsercao, marca) FROM stdin;
    public          postgres    false    210   �       a           2606    16400    produto keycodproduto 
   CONSTRAINT     [   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT keycodproduto PRIMARY KEY (codproduto);
 ?   ALTER TABLE ONLY public.produto DROP CONSTRAINT keycodproduto;
       public            postgres    false    210            c           2606    16407    loja loja_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.loja
    ADD CONSTRAINT loja_pkey PRIMARY KEY ("idLoja");
 8   ALTER TABLE ONLY public.loja DROP CONSTRAINT loja_pkey;
       public            postgres    false    211            �      x������ � �      �   �  x�E�Mn�0���S��- $EJ�Rʏ@n�n���&!2Htg�E��M�0�E�$'���f0|����\��a�-��e�g��X���0.���vg7��u���׾r%(.{ڃ��SIL�tvOB��Y:w�������fC:`��7��ݡ��pmzě��O]c�>c%ǌ�2����a�+��1�&Y��w�Q�����ǅ]X���1�����g�7��u�k!y���F���V^���8̧���G�?���䨛qH�yIz�[�x�}���E8�FE�AzuJ"(���������i���Z�T �F��l�H�ߝ�R�pfj�L��K�ToQm�����C���k��EF!ba	M̋�4%
&�V�5x���*Y�)>���G��%Կ<'��?�k��     