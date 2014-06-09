/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physicshelper;

/**
 *
 * @author Karlin
 */
public class ParticleCalculator {

    double particleMass;
    double photonEnergy;
    double photonFrequency;
    double photonWavelength;
    int energyPrefixFlag;   // 0 = MeV, 1 = GeV, 2 = TeV
    final double PLANCKSCONSTANT = 6.626E-34;
    final double LIGHTSPEED = 2.998E8;
   

    public void CalculatePhotonEnergy(double pMass, int modifier) {


        double result = 0.0;

        setParticleMass(pMass);
        setEnergyPrefixFlag(modifier);

        if (energyPrefixFlag == 0) {
            result = pMass * 1E6 * 1.602E-19;
        } else if (energyPrefixFlag == 1) {
            result = pMass * 1E9 * 1.602E-19;
        } else if (energyPrefixFlag == 2) {
            result = pMass * 1E12 * 1.602E-19;
        }

        setPhotonEnergy(result);
    }

    public double CalculateWavelength() {
        
        photonWavelength = (PLANCKSCONSTANT * LIGHTSPEED) / photonEnergy;
        return photonWavelength;
    }

    public double CalculateFrequency() {
        
        photonFrequency = LIGHTSPEED / photonWavelength;
        return photonFrequency;
    }

    public int getEnergyPrefixFlag() {
        return energyPrefixFlag;
    }

    public void setEnergyPrefixFlag(int energyPrefixFlag) {
        this.energyPrefixFlag = energyPrefixFlag;
    }

    public double getParticleMass() {
        return particleMass;
    }

    public void setParticleMass(double particleMass) {
        this.particleMass = particleMass;
    }

    public double getPhotonEnergy() {
        return photonEnergy;
    }

    public void setPhotonEnergy(double photonEnergy) {
        this.photonEnergy = photonEnergy;
    }

    public double getPhotonFrequency() {
        return photonFrequency;
    }

    public void setPhotonFrequency(double photonFrequency) {
        this.photonFrequency = photonFrequency;
    }

    public double getPhotonWavelength() {
        return photonWavelength;
    }

    public void setPhotonWavelength(double photonWavelength) {
        this.photonWavelength = photonWavelength;
    }

    
}
