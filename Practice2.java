package Logical;

import java.util.Scanner;

public class Practice2 {

	public static void m1(int x, int y) {
		int c = x + y;
		System.out.println(c);
	}

	public static void main(String [] args){
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Practice2.m1(x, y);
}
}

//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//	<modelVersion>4.0.0</modelVersion>
//
//	<groupId>com.ty</groupId>
//	<artifactId>mvc-student</artifactId>
//	<version>0.0.1-SNAPSHOT</version>
//	<packaging>war</packaging>
//
//	<name>mvc-student</name>
//	<url>http://maven.apache.org</url>
//
//	<properties>
//		<java.version>1.6</java.version>
//		<spring.version>3.1.0.RELEASE</spring.version>
//		<cglib.version>2.2.2</cglib.version>
//	</properties>
//
//	<dependencies>
//		<!-- Spring core & mvc -->
//		<dependency>
//			<groupId>org.springframework</groupId>
//			<artifactId>spring-context</artifactId>
//			<version>${spring.version}</version>
//		</dependency>
//
//		<dependency>
//			<groupId>org.springframework</groupId>
//			<artifactId>spring-webmvc</artifactId>
//			<version>${spring.version}</version>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework</groupId>
//			<artifactId>spring-orm</artifactId>
//			<version>${spring.version}</version>
//			<type>jar</type>
//			<scope>compile</scope>
//		</dependency>
//
//		<dependency>
//			<groupId>org.springframework</groupId>
//			<artifactId>spring-test</artifactId>
//			<version>${spring.version}</version>
//			<type>jar</type>
//			<scope>test</scope>
//		</dependency>
//
//		<!-- CGLib for @Configuration -->
//		<dependency>
//			<groupId>cglib</groupId>
//			<artifactId>cglib-nodep</artifactId>
//			<version>${cglib.version}</version>
//			<scope>runtime</scope>
//		</dependency>
//		<dependency>
//			<groupId>junit</groupId>
//			<artifactId>junit</artifactId>
//			<version>4.11</version>
//			<scope>test</scope>
//		</dependency>
//		<dependency>
//			<groupId>mysql</groupId>
//			<artifactId>mysql-connector-java</artifactId>
//			<version>8.0.28</version>
//		</dependency>
//		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
//		<dependency>
//			<groupId>org.hibernate</groupId>
//			<artifactId>hibernate-core</artifactId>
//			<version>5.6.10.Final</version>
//		</dependency>
//		<dependency>
//			<groupId>javax.servlet.jsp</groupId>
//			<artifactId>jsp-api</artifactId>
//			<version>2.2</version>
//			<scope>provided</scope>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework</groupId>
//			<artifactId>spring-context</artifactId>
//			<version>5.3.18</version>
//		</dependency>
//
//		<!-- Servlet Spec -->
//		<dependency>
//			<groupId>javax.servlet</groupId>
//			<artifactId>servlet-api</artifactId>
//			<version>2.4</version>
//			<scope>provided</scope>
//		</dependency>
//		<dependency>
//			<groupId>javax.servlet.jsp</groupId>
//			<artifactId>jsp-api</artifactId>
//			<version>2.1</version>
//			<scope>provided</scope>
//		</dependency>
//	</dependencies>
//
//	<repositories>
//		<repository>
//			<id>springsource-milestones</id>
//			<name>SpringSource Milestones Proxy</name>
//			<url>https://oss.sonatype.org/content/repositories/springsource-milestones</url>
//		</repository>
//	</repositories>
//
//	<build>
//		<finalName>mvc-student</finalName>
//		<plugins>
//			<plugin>
//				<groupId>org.apache.maven.plugins</groupId>
//				<artifactId>maven-compiler-plugin</artifactId>
//				<version>2.0.2</version>
//				<configuration>
//					<source>${java.version}</source>
//					<target>${java.version}</target>
//				</configuration>
//			</plugin>
//		</plugins>
//	</build>
//</project>
