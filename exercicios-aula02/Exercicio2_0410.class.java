????   ; J  3br/com/generation/exercicios_aula02/Exercicio2_0410  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 5Lbr/com/generation/exercicios_aula02/Exercicio2_0410; main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream;  Escreva 3 números: 
    java/io/PrintStream   println (Ljava/lang/String;)V  java/util/Scanner	  ! " # in Ljava/io/InputStream;
  %  & (Ljava/io/InputStream;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . A ordem crescrente é: 
 + 0  
 + 2 3 4 append (I)Ljava/lang/StringBuilder;
 + 6 7 8 toString ()Ljava/lang/String; : A ordem crescente é: 
  < =  close args [Ljava/lang/String; n1 I n2 n3 leia Ljava/util/Scanner; StackMapTable ? 
SourceFile Exercicio2_0410.java !               /     *? ?    
       	             	      ?    ? ? ? Y?  ? $:? '<? '=? '>? )? $? ? +Y-? /? 1? 1? 1? 5? ? ?? )? $? ? +Y-? /? 1? 1? 1? 5? ? ?? )? $? ? +Y-? /? 1? 1? 1? 5? ? a? )? $? ? +Y-? /? 1? 1? 1? 5? ? 6? )? $? ? +Y-? /? 1? 1? 1? 5? ? ? 9? ? ;?    
   ^              &  0  N  Q  [  y  |  ?  ?   ? " ? # ? $ ? & ? ' ? ( ? * /
 1    4    > ?    ? @ A    ? B A  & ? C A   ? D E  F    ? Q  G   ****  H    I