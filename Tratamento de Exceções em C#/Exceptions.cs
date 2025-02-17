using System;

// Definição de exceções personalizadas
public class ValorInvalidoException : Exception
{
    public ValorInvalidoException(string message) : base(message) { }
}

public class SaldoInsuficienteException : Exception
{
    public SaldoInsuficienteException(string message) : base(message) { }
}

public class ContaInexistenteException : Exception
{
    public ContaInexistenteException(string message) : base(message) { }
}