"""
No Exceptions o Python já permite passar a mensagem diretamente ao construtor da classe Exception.

Aqui, criamos três exceções personalizadas: SaldoInsuficienteException, ValorInvalidoException e ContaInexistenteException.

Essas exceções são usadas para sinalizar erros específicos que podem ocorrer durante as operações bancárias.

A classe Exception já tem um construtor que aceita uma mensagem, portanto, não é necessário sobrescrever o método __init__, a menos que você queira adicionar lógica extra ou atributos personalizados.
"""
class SaldoInsuficienteException(Exception):
    pass

class ValorInvalidoException(Exception):
    pass

class ContaInexistenteException(Exception):
    pass