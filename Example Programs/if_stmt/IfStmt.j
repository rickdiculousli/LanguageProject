.class public IfStmt
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti

.field private static i I

; intj

.field private static j I

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
	putstatic        IfStmt/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        IfStmt/_standardIn LPascalTextIn;

; i=1

	ldc	1
	putstatic	IfStmt/i I

; if(i==2){j=2;}else{j=1;}

	getstatic	IfStmt/i I
	ldc	2
	if_icmpeq	L002
	iconst_0
	goto	L003
L002:
	iconst_1
L003:
	ifeq	L001

; j=2

	ldc	2
	putstatic	IfStmt/j I
	goto	L000
L001:

; j=1

	ldc	1
	putstatic	IfStmt/j I
L000:

	getstatic     IfStmt/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
