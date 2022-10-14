package br.com.questao4;

public class Altomovel {
  private boolean abs;
  private boolean airBag;
  private boolean alarme;
  private boolean som;
  private boolean conjuntoEletrico;
  private boolean computadorDeBordo;
  private double precoBase;

  public Altomovel(boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoEletrico,
      boolean computadorDeBordo, double precoBase) {
    this.abs = abs;
    this.airBag = airBag;
    this.alarme = alarme;
    this.som = som;
    this.conjuntoEletrico = conjuntoEletrico;
    this.computadorDeBordo = computadorDeBordo;
    this.precoBase = precoBase;
  }

  public boolean isAbs() {
    return abs;
  }

  public void setAbs(boolean abs) {
    this.abs = abs;
  }

  public boolean isAirBag() {
    return airBag;
  }

  public void setAirBag(boolean airBag) {
    this.airBag = airBag;
  }

  public boolean isAlarme() {
    return alarme;
  }

  public void setAlarme(boolean alarme) {
    this.alarme = alarme;
  }

  public boolean isSom() {
    return som;
  }

  public void setSom(boolean som) {
    this.som = som;
  }

  public boolean isConjuntoEletrico() {
    return conjuntoEletrico;
  }

  public void setConjuntoEletrico(boolean conjuntoEletrico) {
    this.conjuntoEletrico = conjuntoEletrico;
  }

  public boolean isComputadorDeBordo() {
    return computadorDeBordo;
  }

  public void setComputadorDeBordo(boolean computadorDeBordo) {
    this.computadorDeBordo = computadorDeBordo;
  }

  public double getPrecoBase() {
    return precoBase;
  }

  public void setPrecoBase(double precoBase) {
    this.precoBase = precoBase;
  }

  public void calcularPrecoFinal() {
    if (this.abs) {
      this.precoBase += (this.precoBase * 15) / 100;
    }
    if (this.airBag) {
      this.precoBase += (this.precoBase * 10) / 100;
    }
    if (this.alarme) {
      this.precoBase += (this.precoBase * 3) / 100;
    }
    if (this.som) {
      this.precoBase += (this.precoBase * 2) / 100;
    }
    if (this.conjuntoEletrico) {
      this.precoBase += (this.precoBase * 5) / 100;
    }
    if (this.computadorDeBordo) {
      this.precoBase += (this.precoBase * 10) / 100;
    }
  }
}
