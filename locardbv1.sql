PGDMP     $        
        	    w         	   lojacardb    12.0    12.0 ^    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16393 	   lojacardb    DATABASE     �   CREATE DATABASE lojacardb WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE lojacardb;
                postgres    false            �            1259    16394    cliente    TABLE     �   CREATE TABLE public.cliente (
    codigocliente integer NOT NULL,
    fkcodigorol integer NOT NULL,
    fkcodigopersonas integer NOT NULL
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    16397    cliente_codigocliente_seq    SEQUENCE     �   CREATE SEQUENCE public.cliente_codigocliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.cliente_codigocliente_seq;
       public          postgres    false    202            �           0    0    cliente_codigocliente_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.cliente_codigocliente_seq OWNED BY public.cliente.codigocliente;
          public          postgres    false    203            �            1259    16399    empleado    TABLE     �   CREATE TABLE public.empleado (
    codigoempleado integer NOT NULL,
    fkcodigorole integer NOT NULL,
    fkcodigopersonae integer NOT NULL,
    area character varying
);
    DROP TABLE public.empleado;
       public         heap    postgres    false            �            1259    16402    empleado_codigoempleado_seq    SEQUENCE     �   CREATE SEQUENCE public.empleado_codigoempleado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.empleado_codigoempleado_seq;
       public          postgres    false    204            �           0    0    empleado_codigoempleado_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.empleado_codigoempleado_seq OWNED BY public.empleado.codigoempleado;
          public          postgres    false    205            �            1259    16404    estadopedido    TABLE     �   CREATE TABLE public.estadopedido (
    codigoep integer NOT NULL,
    fkcodigopedidocliente integer NOT NULL,
    descripcion character varying(40) NOT NULL
);
     DROP TABLE public.estadopedido;
       public         heap    postgres    false            �            1259    16407    estadopedido_codigoep_seq    SEQUENCE     �   CREATE SEQUENCE public.estadopedido_codigoep_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.estadopedido_codigoep_seq;
       public          postgres    false    206            �           0    0    estadopedido_codigoep_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.estadopedido_codigoep_seq OWNED BY public.estadopedido.codigoep;
          public          postgres    false    207            �            1259    16409    pedidocliente    TABLE     �   CREATE TABLE public.pedidocliente (
    codigopedidocliente integer NOT NULL,
    fkcodigocliente integer NOT NULL,
    fkcodigoempleado integer NOT NULL,
    fkcodigoproducto integer NOT NULL
);
 !   DROP TABLE public.pedidocliente;
       public         heap    postgres    false            �            1259    16412 %   pedidocliente_codigopedidocliente_seq    SEQUENCE     �   CREATE SEQUENCE public.pedidocliente_codigopedidocliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 <   DROP SEQUENCE public.pedidocliente_codigopedidocliente_seq;
       public          postgres    false    208            �           0    0 %   pedidocliente_codigopedidocliente_seq    SEQUENCE OWNED BY     o   ALTER SEQUENCE public.pedidocliente_codigopedidocliente_seq OWNED BY public.pedidocliente.codigopedidocliente;
          public          postgres    false    209            �            1259    16414    persona    TABLE     L  CREATE TABLE public.persona (
    codigopersona integer NOT NULL,
    nombre character varying(20) NOT NULL,
    apellido character varying(20) NOT NULL,
    cedula character varying(10) NOT NULL,
    telefono character varying(10) NOT NULL,
    email character varying(20) NOT NULL,
    direccion character varying(20) NOT NULL
);
    DROP TABLE public.persona;
       public         heap    postgres    false            �            1259    16417    persona_codigopersona_seq    SEQUENCE     �   CREATE SEQUENCE public.persona_codigopersona_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.persona_codigopersona_seq;
       public          postgres    false    210            �           0    0    persona_codigopersona_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.persona_codigopersona_seq OWNED BY public.persona.codigopersona;
          public          postgres    false    211            �            1259    16419    producto    TABLE     �   CREATE TABLE public.producto (
    codigoproducto integer NOT NULL,
    fkcodigotp integer NOT NULL,
    fkcodigoproveedores integer NOT NULL,
    fkcodigopedidocliente integer NOT NULL
);
    DROP TABLE public.producto;
       public         heap    postgres    false            �            1259    16422    producto_codigoproducto_seq    SEQUENCE     �   CREATE SEQUENCE public.producto_codigoproducto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.producto_codigoproducto_seq;
       public          postgres    false    212            �           0    0    producto_codigoproducto_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.producto_codigoproducto_seq OWNED BY public.producto.codigoproducto;
          public          postgres    false    213            �            1259    16424    proveedores    TABLE     �   CREATE TABLE public.proveedores (
    codigoproveedores integer NOT NULL,
    nombreproveedores character varying(20) NOT NULL
);
    DROP TABLE public.proveedores;
       public         heap    postgres    false            �            1259    16427 !   proveedores_codigoproveedores_seq    SEQUENCE     �   CREATE SEQUENCE public.proveedores_codigoproveedores_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.proveedores_codigoproveedores_seq;
       public          postgres    false    214            �           0    0 !   proveedores_codigoproveedores_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.proveedores_codigoproveedores_seq OWNED BY public.proveedores.codigoproveedores;
          public          postgres    false    215            �            1259    16429 	   repuestos    TABLE     �   CREATE TABLE public.repuestos (
    codigorepuestos integer NOT NULL,
    nombrerepuesto character varying(30) NOT NULL,
    fkcodigotpr integer NOT NULL
);
    DROP TABLE public.repuestos;
       public         heap    postgres    false            �            1259    16432    repuestos_codigorepuestos_seq    SEQUENCE     �   CREATE SEQUENCE public.repuestos_codigorepuestos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.repuestos_codigorepuestos_seq;
       public          postgres    false    216            �           0    0    repuestos_codigorepuestos_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.repuestos_codigorepuestos_seq OWNED BY public.repuestos.codigorepuestos;
          public          postgres    false    217            �            1259    16434    rol    TABLE     j   CREATE TABLE public.rol (
    codigorol integer NOT NULL,
    nombrerol character varying(30) NOT NULL
);
    DROP TABLE public.rol;
       public         heap    postgres    false            �            1259    16437    rol_codigorol_seq    SEQUENCE     �   CREATE SEQUENCE public.rol_codigorol_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.rol_codigorol_seq;
       public          postgres    false    218            �           0    0    rol_codigorol_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.rol_codigorol_seq OWNED BY public.rol.codigorol;
          public          postgres    false    219            �            1259    16439    tipoproducto    TABLE     q   CREATE TABLE public.tipoproducto (
    codigotp integer NOT NULL,
    nombretp character varying(30) NOT NULL
);
     DROP TABLE public.tipoproducto;
       public         heap    postgres    false            �            1259    16442    tipoproducto_codigotp_seq    SEQUENCE     �   CREATE SEQUENCE public.tipoproducto_codigotp_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.tipoproducto_codigotp_seq;
       public          postgres    false    220            �           0    0    tipoproducto_codigotp_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.tipoproducto_codigotp_seq OWNED BY public.tipoproducto.codigotp;
          public          postgres    false    221            �            1259    16444 	   vehiculos    TABLE       CREATE TABLE public.vehiculos (
    codigovehiculos integer NOT NULL,
    fkcodigotpv integer NOT NULL,
    marca character varying(30) NOT NULL,
    modelo character varying(30) NOT NULL,
    anio character varying(30) NOT NULL,
    cc character varying(30) NOT NULL
);
    DROP TABLE public.vehiculos;
       public         heap    postgres    false            �            1259    16447    vehiculos_codigovehiculos_seq    SEQUENCE     �   CREATE SEQUENCE public.vehiculos_codigovehiculos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.vehiculos_codigovehiculos_seq;
       public          postgres    false    222            �           0    0    vehiculos_codigovehiculos_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.vehiculos_codigovehiculos_seq OWNED BY public.vehiculos.codigovehiculos;
          public          postgres    false    223            �
           2604    16449    cliente codigocliente    DEFAULT     ~   ALTER TABLE ONLY public.cliente ALTER COLUMN codigocliente SET DEFAULT nextval('public.cliente_codigocliente_seq'::regclass);
 D   ALTER TABLE public.cliente ALTER COLUMN codigocliente DROP DEFAULT;
       public          postgres    false    203    202            �
           2604    16450    empleado codigoempleado    DEFAULT     �   ALTER TABLE ONLY public.empleado ALTER COLUMN codigoempleado SET DEFAULT nextval('public.empleado_codigoempleado_seq'::regclass);
 F   ALTER TABLE public.empleado ALTER COLUMN codigoempleado DROP DEFAULT;
       public          postgres    false    205    204            �
           2604    16451    estadopedido codigoep    DEFAULT     ~   ALTER TABLE ONLY public.estadopedido ALTER COLUMN codigoep SET DEFAULT nextval('public.estadopedido_codigoep_seq'::regclass);
 D   ALTER TABLE public.estadopedido ALTER COLUMN codigoep DROP DEFAULT;
       public          postgres    false    207    206            �
           2604    16452 !   pedidocliente codigopedidocliente    DEFAULT     �   ALTER TABLE ONLY public.pedidocliente ALTER COLUMN codigopedidocliente SET DEFAULT nextval('public.pedidocliente_codigopedidocliente_seq'::regclass);
 P   ALTER TABLE public.pedidocliente ALTER COLUMN codigopedidocliente DROP DEFAULT;
       public          postgres    false    209    208            �
           2604    16453    persona codigopersona    DEFAULT     ~   ALTER TABLE ONLY public.persona ALTER COLUMN codigopersona SET DEFAULT nextval('public.persona_codigopersona_seq'::regclass);
 D   ALTER TABLE public.persona ALTER COLUMN codigopersona DROP DEFAULT;
       public          postgres    false    211    210            �
           2604    16454    producto codigoproducto    DEFAULT     �   ALTER TABLE ONLY public.producto ALTER COLUMN codigoproducto SET DEFAULT nextval('public.producto_codigoproducto_seq'::regclass);
 F   ALTER TABLE public.producto ALTER COLUMN codigoproducto DROP DEFAULT;
       public          postgres    false    213    212            �
           2604    16455    proveedores codigoproveedores    DEFAULT     �   ALTER TABLE ONLY public.proveedores ALTER COLUMN codigoproveedores SET DEFAULT nextval('public.proveedores_codigoproveedores_seq'::regclass);
 L   ALTER TABLE public.proveedores ALTER COLUMN codigoproveedores DROP DEFAULT;
       public          postgres    false    215    214            �
           2604    16456    repuestos codigorepuestos    DEFAULT     �   ALTER TABLE ONLY public.repuestos ALTER COLUMN codigorepuestos SET DEFAULT nextval('public.repuestos_codigorepuestos_seq'::regclass);
 H   ALTER TABLE public.repuestos ALTER COLUMN codigorepuestos DROP DEFAULT;
       public          postgres    false    217    216            �
           2604    16457    rol codigorol    DEFAULT     n   ALTER TABLE ONLY public.rol ALTER COLUMN codigorol SET DEFAULT nextval('public.rol_codigorol_seq'::regclass);
 <   ALTER TABLE public.rol ALTER COLUMN codigorol DROP DEFAULT;
       public          postgres    false    219    218            �
           2604    16458    tipoproducto codigotp    DEFAULT     ~   ALTER TABLE ONLY public.tipoproducto ALTER COLUMN codigotp SET DEFAULT nextval('public.tipoproducto_codigotp_seq'::regclass);
 D   ALTER TABLE public.tipoproducto ALTER COLUMN codigotp DROP DEFAULT;
       public          postgres    false    221    220            �
           2604    16459    vehiculos codigovehiculos    DEFAULT     �   ALTER TABLE ONLY public.vehiculos ALTER COLUMN codigovehiculos SET DEFAULT nextval('public.vehiculos_codigovehiculos_seq'::regclass);
 H   ALTER TABLE public.vehiculos ALTER COLUMN codigovehiculos DROP DEFAULT;
       public          postgres    false    223    222            h          0    16394    cliente 
   TABLE DATA           O   COPY public.cliente (codigocliente, fkcodigorol, fkcodigopersonas) FROM stdin;
    public          postgres    false    202   ms       j          0    16399    empleado 
   TABLE DATA           X   COPY public.empleado (codigoempleado, fkcodigorole, fkcodigopersonae, area) FROM stdin;
    public          postgres    false    204   �s       l          0    16404    estadopedido 
   TABLE DATA           T   COPY public.estadopedido (codigoep, fkcodigopedidocliente, descripcion) FROM stdin;
    public          postgres    false    206   �s       n          0    16409    pedidocliente 
   TABLE DATA           q   COPY public.pedidocliente (codigopedidocliente, fkcodigocliente, fkcodigoempleado, fkcodigoproducto) FROM stdin;
    public          postgres    false    208   �s       p          0    16414    persona 
   TABLE DATA           f   COPY public.persona (codigopersona, nombre, apellido, cedula, telefono, email, direccion) FROM stdin;
    public          postgres    false    210   t       r          0    16419    producto 
   TABLE DATA           j   COPY public.producto (codigoproducto, fkcodigotp, fkcodigoproveedores, fkcodigopedidocliente) FROM stdin;
    public          postgres    false    212   Ht       t          0    16424    proveedores 
   TABLE DATA           K   COPY public.proveedores (codigoproveedores, nombreproveedores) FROM stdin;
    public          postgres    false    214   et       v          0    16429 	   repuestos 
   TABLE DATA           Q   COPY public.repuestos (codigorepuestos, nombrerepuesto, fkcodigotpr) FROM stdin;
    public          postgres    false    216   �t       x          0    16434    rol 
   TABLE DATA           3   COPY public.rol (codigorol, nombrerol) FROM stdin;
    public          postgres    false    218   �t       z          0    16439    tipoproducto 
   TABLE DATA           :   COPY public.tipoproducto (codigotp, nombretp) FROM stdin;
    public          postgres    false    220   �t       |          0    16444 	   vehiculos 
   TABLE DATA           Z   COPY public.vehiculos (codigovehiculos, fkcodigotpv, marca, modelo, anio, cc) FROM stdin;
    public          postgres    false    222   �t       �           0    0    cliente_codigocliente_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.cliente_codigocliente_seq', 1, false);
          public          postgres    false    203            �           0    0    empleado_codigoempleado_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.empleado_codigoempleado_seq', 2, true);
          public          postgres    false    205            �           0    0    estadopedido_codigoep_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.estadopedido_codigoep_seq', 1, false);
          public          postgres    false    207            �           0    0 %   pedidocliente_codigopedidocliente_seq    SEQUENCE SET     T   SELECT pg_catalog.setval('public.pedidocliente_codigopedidocliente_seq', 1, false);
          public          postgres    false    209            �           0    0    persona_codigopersona_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.persona_codigopersona_seq', 2, true);
          public          postgres    false    211            �           0    0    producto_codigoproducto_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.producto_codigoproducto_seq', 1, false);
          public          postgres    false    213            �           0    0 !   proveedores_codigoproveedores_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.proveedores_codigoproveedores_seq', 1, false);
          public          postgres    false    215            �           0    0    repuestos_codigorepuestos_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.repuestos_codigorepuestos_seq', 1, false);
          public          postgres    false    217            �           0    0    rol_codigorol_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.rol_codigorol_seq', 3, true);
          public          postgres    false    219            �           0    0    tipoproducto_codigotp_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.tipoproducto_codigotp_seq', 1, false);
          public          postgres    false    221            �           0    0    vehiculos_codigovehiculos_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.vehiculos_codigovehiculos_seq', 1, false);
          public          postgres    false    223            �
           2606    16461    cliente cliente_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (codigocliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    202            �
           2606    16463    empleado empleado_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (codigoempleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public            postgres    false    204            �
           2606    16465    estadopedido estadopedido_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.estadopedido
    ADD CONSTRAINT estadopedido_pkey PRIMARY KEY (codigoep);
 H   ALTER TABLE ONLY public.estadopedido DROP CONSTRAINT estadopedido_pkey;
       public            postgres    false    206            �
           2606    16467     pedidocliente pedidocliente_pkey 
   CONSTRAINT     o   ALTER TABLE ONLY public.pedidocliente
    ADD CONSTRAINT pedidocliente_pkey PRIMARY KEY (codigopedidocliente);
 J   ALTER TABLE ONLY public.pedidocliente DROP CONSTRAINT pedidocliente_pkey;
       public            postgres    false    208            �
           2606    16469    persona persona_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (codigopersona);
 >   ALTER TABLE ONLY public.persona DROP CONSTRAINT persona_pkey;
       public            postgres    false    210            �
           2606    16471    producto producto_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (codigoproducto);
 @   ALTER TABLE ONLY public.producto DROP CONSTRAINT producto_pkey;
       public            postgres    false    212            �
           2606    16473    proveedores proveedores_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.proveedores
    ADD CONSTRAINT proveedores_pkey PRIMARY KEY (codigoproveedores);
 F   ALTER TABLE ONLY public.proveedores DROP CONSTRAINT proveedores_pkey;
       public            postgres    false    214            �
           2606    16475    repuestos repuestos_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.repuestos
    ADD CONSTRAINT repuestos_pkey PRIMARY KEY (codigorepuestos);
 B   ALTER TABLE ONLY public.repuestos DROP CONSTRAINT repuestos_pkey;
       public            postgres    false    216            �
           2606    16477    rol rol_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_pkey PRIMARY KEY (codigorol);
 6   ALTER TABLE ONLY public.rol DROP CONSTRAINT rol_pkey;
       public            postgres    false    218            �
           2606    16479    tipoproducto tipoproducto_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.tipoproducto
    ADD CONSTRAINT tipoproducto_pkey PRIMARY KEY (codigotp);
 H   ALTER TABLE ONLY public.tipoproducto DROP CONSTRAINT tipoproducto_pkey;
       public            postgres    false    220            �
           2606    16481    vehiculos vehiculos_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.vehiculos
    ADD CONSTRAINT vehiculos_pkey PRIMARY KEY (codigovehiculos);
 B   ALTER TABLE ONLY public.vehiculos DROP CONSTRAINT vehiculos_pkey;
       public            postgres    false    222            �
           2606    16482 #   cliente fk_cliente_fkcodigopersonas    FK CONSTRAINT     �   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_cliente_fkcodigopersonas FOREIGN KEY (fkcodigopersonas) REFERENCES public.persona(codigopersona);
 M   ALTER TABLE ONLY public.cliente DROP CONSTRAINT fk_cliente_fkcodigopersonas;
       public          postgres    false    210    2768    202            �
           2606    16487    cliente fk_cliente_fkcodigorol    FK CONSTRAINT     �   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_cliente_fkcodigorol FOREIGN KEY (fkcodigorol) REFERENCES public.rol(codigorol);
 H   ALTER TABLE ONLY public.cliente DROP CONSTRAINT fk_cliente_fkcodigorol;
       public          postgres    false    218    202    2776            �
           2606    16492 %   empleado fk_empleado_fkcodigopersonae    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT fk_empleado_fkcodigopersonae FOREIGN KEY (fkcodigopersonae) REFERENCES public.persona(codigopersona);
 O   ALTER TABLE ONLY public.empleado DROP CONSTRAINT fk_empleado_fkcodigopersonae;
       public          postgres    false    2768    204    210            �
           2606    16497 !   empleado fk_empleado_fkcodigorole    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT fk_empleado_fkcodigorole FOREIGN KEY (fkcodigorole) REFERENCES public.rol(codigorol);
 K   ALTER TABLE ONLY public.empleado DROP CONSTRAINT fk_empleado_fkcodigorole;
       public          postgres    false    218    204    2776            �
           2606    16502 2   estadopedido fk_estadopedido_fkcodigopedidocliente    FK CONSTRAINT     �   ALTER TABLE ONLY public.estadopedido
    ADD CONSTRAINT fk_estadopedido_fkcodigopedidocliente FOREIGN KEY (fkcodigopedidocliente) REFERENCES public.pedidocliente(codigopedidocliente);
 \   ALTER TABLE ONLY public.estadopedido DROP CONSTRAINT fk_estadopedido_fkcodigopedidocliente;
       public          postgres    false    208    206    2766            �
           2606    16507 .   producto fk_estadopedido_fkcodigopedidocliente    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT fk_estadopedido_fkcodigopedidocliente FOREIGN KEY (fkcodigopedidocliente) REFERENCES public.pedidocliente(codigopedidocliente);
 X   ALTER TABLE ONLY public.producto DROP CONSTRAINT fk_estadopedido_fkcodigopedidocliente;
       public          postgres    false    212    208    2766            �
           2606    16512 ,   producto fk_estadopedido_fkcodigoproveedores    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT fk_estadopedido_fkcodigoproveedores FOREIGN KEY (fkcodigoproveedores) REFERENCES public.proveedores(codigoproveedores);
 V   ALTER TABLE ONLY public.producto DROP CONSTRAINT fk_estadopedido_fkcodigoproveedores;
       public          postgres    false    212    2772    214            �
           2606    16517 #   producto fk_estadopedido_fkcodigotp    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT fk_estadopedido_fkcodigotp FOREIGN KEY (fkcodigotp) REFERENCES public.tipoproducto(codigotp);
 M   ALTER TABLE ONLY public.producto DROP CONSTRAINT fk_estadopedido_fkcodigotp;
       public          postgres    false    220    2778    212            �
           2606    16522 .   pedidocliente fk_pedidocliente_fkcodigocliente    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedidocliente
    ADD CONSTRAINT fk_pedidocliente_fkcodigocliente FOREIGN KEY (fkcodigocliente) REFERENCES public.cliente(codigocliente);
 X   ALTER TABLE ONLY public.pedidocliente DROP CONSTRAINT fk_pedidocliente_fkcodigocliente;
       public          postgres    false    2760    202    208            �
           2606    16527 /   pedidocliente fk_pedidocliente_fkcodigoempleado    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedidocliente
    ADD CONSTRAINT fk_pedidocliente_fkcodigoempleado FOREIGN KEY (fkcodigoempleado) REFERENCES public.empleado(codigoempleado);
 Y   ALTER TABLE ONLY public.pedidocliente DROP CONSTRAINT fk_pedidocliente_fkcodigoempleado;
       public          postgres    false    204    2762    208            �
           2606    16532 /   pedidocliente fk_pedidocliente_fkcodigoproducto    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedidocliente
    ADD CONSTRAINT fk_pedidocliente_fkcodigoproducto FOREIGN KEY (fkcodigoproducto) REFERENCES public.producto(codigoproducto);
 Y   ALTER TABLE ONLY public.pedidocliente DROP CONSTRAINT fk_pedidocliente_fkcodigoproducto;
       public          postgres    false    208    2770    212            �
           2606    16537 "   repuestos fk_repuestos_fkcodigotpr    FK CONSTRAINT     �   ALTER TABLE ONLY public.repuestos
    ADD CONSTRAINT fk_repuestos_fkcodigotpr FOREIGN KEY (fkcodigotpr) REFERENCES public.tipoproducto(codigotp);
 L   ALTER TABLE ONLY public.repuestos DROP CONSTRAINT fk_repuestos_fkcodigotpr;
       public          postgres    false    220    2778    216            �
           2606    16542 "   vehiculos fk_vehiculos_fkcodigotpv    FK CONSTRAINT     �   ALTER TABLE ONLY public.vehiculos
    ADD CONSTRAINT fk_vehiculos_fkcodigotpv FOREIGN KEY (fkcodigotpv) REFERENCES public.tipoproducto(codigotp);
 L   ALTER TABLE ONLY public.vehiculos DROP CONSTRAINT fk_vehiculos_fkcodigotpv;
       public          postgres    false    220    2778    222            h      x������ � �      j   .   x�3�4Bǔ�̼�⒢����<�ԼԢ�.#��.�=... i8A      l      x������ � �      n      x������ � �      p   6   x�3�*-N���J,J�����J��LOO�,���g%rq��U��S���� ���      r      x������ � �      t      x������ � �      v      x������ � �      x   .   x�3�tO-J�+I�2�NM/-�LIL�2�t��+IL�/����� �x      z      x������ � �      |      x������ � �     