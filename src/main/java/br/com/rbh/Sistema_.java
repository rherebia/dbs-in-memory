package br.com.rbh;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Sistema.class)
public class Sistema_ {

	public static volatile SingularAttribute<Sistema, Long> id;
	public static volatile SingularAttribute<Sistema, String> nome;
}
