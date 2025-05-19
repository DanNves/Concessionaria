import React from 'react';

interface Vehicle {
  marca: string;
  modelo: string;
  ano: number;
  cor: string;
  preco: number;
  disponivel: boolean;
  placa: string;
  tipoCombustivel: 'GASOLINA' | 'DIESEL' | 'FLEX' | 'ELETRICO' | 'HIBRIDO';
  quilometragem: number;
  novo: boolean;
}

const VehicleList: React.FC = () => {
  return (
    <div className="container mx-auto p-4">
      <h2 className="text-2xl font-bold mb-4">Lista de Veículos</h2>
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
        {/* Vehicle cards will be rendered here */}
      </div>
    </div>
  );
};

export default VehicleList;