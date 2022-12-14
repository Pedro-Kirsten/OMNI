PGDMP                         z            OMNI    14.5    14.5                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16490    OMNI    DATABASE     f   CREATE DATABASE "OMNI" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE "OMNI";
                postgres    false            ?            1259    16647    loja    TABLE     ?   CREATE TABLE public.loja (
    idloja integer NOT NULL,
    nomeloja character varying,
    cnpj character varying,
    localizacao character varying,
    telefone character varying(15)
);
    DROP TABLE public.loja;
       public         heap    postgres    false            ?            1259    16669    loja_idloja_seq    SEQUENCE     ?   ALTER TABLE public.loja ALTER COLUMN idloja ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.loja_idloja_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    212            ?            1259    16620    pedido    TABLE     ?   CREATE TABLE public.pedido (
    codpedido integer NOT NULL,
    valortotal double precision,
    enderecoentrega character varying
);
    DROP TABLE public.pedido;
       public         heap    postgres    false            ?            1259    16627    pedido_codpedido_seq    SEQUENCE     ?   ALTER TABLE public.pedido ALTER COLUMN codpedido ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pedido_codpedido_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    209            ?            1259    16642    pedidoproduto    TABLE     e   CREATE TABLE public.pedidoproduto (
    codpedidoproduto integer NOT NULL,
    quantidade integer
);
 !   DROP TABLE public.pedidoproduto;
       public         heap    postgres    false            ?            1259    16676    pessoa    TABLE     ?   CREATE TABLE public.pessoa (
    idpessoa integer NOT NULL,
    nomepessoa character varying,
    endereco character varying,
    telefone character varying,
    cpf character varying
);
    DROP TABLE public.pessoa;
       public         heap    postgres    false            ?            1259    16683    pessoa_idpessoa_seq    SEQUENCE     ?   ALTER TABLE public.pessoa ALTER COLUMN idpessoa ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pessoa_idpessoa_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    216            ?            1259    16664    produto    TABLE     ?   CREATE TABLE public.produto (
    codproduto integer NOT NULL,
    nomeproduto character varying(100),
    marca character varying(100),
    valor integer
);
    DROP TABLE public.produto;
       public         heap    postgres    false            ?            1259    16675    produto_codproduto_seq    SEQUENCE     ?   ALTER TABLE public.produto ALTER COLUMN codproduto ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.produto_codproduto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    213                      0    16647    loja 
   TABLE DATA           M   COPY public.loja (idloja, nomeloja, cnpj, localizacao, telefone) FROM stdin;
    public          postgres    false    212   w                 0    16620    pedido 
   TABLE DATA           H   COPY public.pedido (codpedido, valortotal, enderecoentrega) FROM stdin;
    public          postgres    false    209   >                 0    16642    pedidoproduto 
   TABLE DATA           E   COPY public.pedidoproduto (codpedidoproduto, quantidade) FROM stdin;
    public          postgres    false    211   [                 0    16676    pessoa 
   TABLE DATA           O   COPY public.pessoa (idpessoa, nomepessoa, endereco, telefone, cpf) FROM stdin;
    public          postgres    false    216   x                 0    16664    produto 
   TABLE DATA           H   COPY public.produto (codproduto, nomeproduto, marca, valor) FROM stdin;
    public          postgres    false    213   ?                  0    0    loja_idloja_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.loja_idloja_seq', 6, true);
          public          postgres    false    214                       0    0    pedido_codpedido_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.pedido_codpedido_seq', 1, false);
          public          postgres    false    210                       0    0    pessoa_idpessoa_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.pessoa_idpessoa_seq', 1, false);
          public          postgres    false    217                       0    0    produto_codproduto_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.produto_codproduto_seq', 5, true);
          public          postgres    false    215            t           2606    16653    loja loja_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.loja
    ADD CONSTRAINT loja_pkey PRIMARY KEY (idloja);
 8   ALTER TABLE ONLY public.loja DROP CONSTRAINT loja_pkey;
       public            postgres    false    212            p           2606    16626    pedido pedido_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (codpedido);
 <   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_pkey;
       public            postgres    false    209            r           2606    16646     pedidoproduto pedidoproduto_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.pedidoproduto
    ADD CONSTRAINT pedidoproduto_pkey PRIMARY KEY (codpedidoproduto);
 J   ALTER TABLE ONLY public.pedidoproduto DROP CONSTRAINT pedidoproduto_pkey;
       public            postgres    false    211            x           2606    16682    pessoa pessoa_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT pessoa_pkey PRIMARY KEY (idpessoa);
 <   ALTER TABLE ONLY public.pessoa DROP CONSTRAINT pessoa_pkey;
       public            postgres    false    216            v           2606    16668    produto produto_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (codproduto);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    213               ?   x?5?;?0@??>rl?7#H?,T???(?'b?Az1>?e?=?V???FXwMnϩO?g?ph?Hb?·?uR"?Lb=iQۦ?)??£2?0Y\???01?Ĉ?U?)_?&î??_P???2'?4???]?.???g?$???"?%?ؒv꘺q?+?{9?s*}0X?J;2??Jk??c?W            x?????? ? ?            x?????? ? ?            x?????? ? ?         t   x??A?0???S?&H+v?F?	n*??vd*	????????\??S??B?=ո?e5?Gӣ?A???CU?Y?X?Y?Q?I???????p䉇Eq{sJ?-???;"?@- ?     