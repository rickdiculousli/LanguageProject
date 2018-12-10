.class public WhileLoop
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti

.field private static i I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        WhileLoop/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        WhileLoop/_standardIn LPascalTextIn;

; i=0

	ldc	0
	putstatic	WhileLoop/i I

; while(i<20){i=i+2;}

L000:
	getstatic	WhileLoop/i I
	ldc	20
	if_icmplt	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; i=i+2

	getstatic	WhileLoop/i I
	ldc	2
	iadd
	putstatic	WhileLoop/i I
	goto	L000
L001:

	getstatic     WhileLoop/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
