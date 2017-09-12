# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ejemplo (
  id                            bigint auto_increment not null,
  nombre                        varchar(60) not null,
  constraint pk_ejemplo primary key (id)
);

create table usuario (
  id                            bigint auto_increment not null,
  nombre                        varchar(60) not null,
  constraint pk_usuario primary key (id)
);


# --- !Downs

drop table if exists ejemplo;

drop table if exists usuario;

