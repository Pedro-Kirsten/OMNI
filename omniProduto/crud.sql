PGDMP     '    !    
            z            postgres    14.5    14.5     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
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
                        false    2            �            1259    16470    loja    TABLE     �   CREATE TABLE public.loja (
    "idLoja" integer NOT NULL,
    cnpj "char" NOT NULL,
    "nomeLoja" character varying NOT NULL,
    "telefoneLoja" character varying NOT NULL
);
    DROP TABLE public.loja;
       public         heap    postgres    false            �            1259    16394    produto    TABLE     �   CREATE TABLE public.produto (
    codproduto integer NOT NULL,
    nome character varying(100),
    descricao character varying(200),
    preco numeric,
    "dataInsercao" integer,
    marca character varying(100)
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �          0    16470    loja 
   TABLE DATA           J   COPY public.loja ("idLoja", cnpj, "nomeLoja", "telefoneLoja") FROM stdin;
    public          postgres    false    211   u       �          0    16394    produto 
   TABLE DATA           \   COPY public.produto (codproduto, nome, descricao, preco, "dataInsercao", marca) FROM stdin;
    public          postgres    false    210   �       a           2606    16400    produto keycodproduto 
   CONSTRAINT     [   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT keycodproduto PRIMARY KEY (codproduto);
 ?   ALTER TABLE ONLY public.produto DROP CONSTRAINT keycodproduto;
       public            postgres    false    210            c           2606    16476    loja loja_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.loja
    ADD CONSTRAINT loja_pkey PRIMARY KEY ("idLoja");
 8   ALTER TABLE ONLY public.loja DROP CONSTRAINT loja_pkey;
       public            postgres    false    211            �      x������ � �      �      x������ � �     